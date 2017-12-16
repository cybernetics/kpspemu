package com.soywiz.kpspemu.hle.modules

import com.soywiz.klock.Klock
import com.soywiz.korio.async.Signal
import com.soywiz.korio.util.hasFlag
import com.soywiz.korio.util.nextAlignedTo
import com.soywiz.korio.util.unsigned
import com.soywiz.kpspemu.cpu.CpuState
import com.soywiz.kpspemu.hle.SceSubmodule
import com.soywiz.kpspemu.hle.error.SceKernelErrors
import com.soywiz.kpspemu.hle.error.sceKernelException
import com.soywiz.kpspemu.hle.manager.MemoryAnchor
import com.soywiz.kpspemu.hle.manager.MemoryPartition
import com.soywiz.kpspemu.hle.manager.OutOfMemoryError
import com.soywiz.kpspemu.hle.manager.microseconds
import com.soywiz.kpspemu.mem.*
import com.soywiz.kpspemu.memoryManager
import com.soywiz.kpspemu.util.*

class ThreadManForUser_Vpl(val tmodule: ThreadManForUser) : SceSubmodule<ThreadManForUser>(tmodule) {
	companion object {
		const val PSP_VPL_ATTR_FIFO = 0x0000
		const val PSP_VPL_ATTR_PRIORITY = 0x0100
		const val PSP_VPL_ATTR_SMALLEST = 0x0200
		const val PSP_VPL_ATTR_MASK_ORDER = 0x0300
		const val PSP_VPL_ATTR_HIGHMEM = 0x4000
		const val PSP_VPL_ATTR_KNOWN = PSP_VPL_ATTR_FIFO or PSP_VPL_ATTR_PRIORITY or PSP_VPL_ATTR_SMALLEST or PSP_VPL_ATTR_HIGHMEM
	}

	class PspVpl(override val id: Int) : ResourceItem {
		val info = SceKernelVplInfo()
		lateinit var part: MemoryPartition

		fun getUpdatedInfo() = info.apply {
			info.freeSize = part.getTotalFreeMemoryInt()
		}

		val onFree = Signal<Unit>()
	}

	val vpls = ResourceList(
		name = "Vpl",
		notFound = { sceKernelException(SceKernelErrors.ERROR_KERNEL_NOT_FOUND_VPOOL) }
	) { PspVpl(it) }

	fun sceKernelCreateVpl(name: String, part: Int, attr: Int, size: Int, param: Ptr): Int {
		val vpl = vpls.alloc()
		val asize = size - 0x20
		vpl.info.name = name
		vpl.info.attr = attr
		vpl.info.poolSize = asize
		vpl.part = memoryManager.userPartition.allocate(asize, anchor = when {
			attr hasFlag PSP_VPL_ATTR_HIGHMEM -> MemoryAnchor.High
			else -> MemoryAnchor.Low
		})
		return vpl.id
	}

	private fun vpl(uid: Int) = vpls.tryGetById(uid)
		?: sceKernelException(SceKernelErrors.ERROR_KERNEL_NOT_FOUND_VPOOL)

	//val RegisterReader.vpl: PspVpl get() = vpl(int)

	// @TODO: Wait for available space when not trying
	suspend fun _sceKernelAllocateVpl(uid: Int, size: Int, outPtr: Ptr32, timeoutPtr: Ptr32, doTry: Boolean): Int {
		val timeStart = Klock.currentTimeMillis()
		val vpl = vpl(uid)
		retry@ while (true) {
			try {
				if (size !in 1..vpl.info.poolSize) sceKernelException(SceKernelErrors.ERROR_KERNEL_ILLEGAL_MEMSIZE)
				val ptr = vpl.part.allocateHigh((size + 8).nextAlignedTo(8)) // 8 aligned extra bytes to track the allocation
				outPtr[0] = ptr.low_i
				return 0
			} catch (e: OutOfMemoryError) {
				if (!doTry && timeoutPtr.isNotNull) {
					try {
						vpl.onFree.waitOneTimeout(timeoutPtr.get().microseconds)
						continue@retry
					} catch (e: TimeoutException) {
						timeoutPtr.set(0)
						return SceKernelErrors.ERROR_KERNEL_WAIT_TIMEOUT
					}
				}
				return SceKernelErrors.ERROR_OUT_OF_MEMORY
			}
		}
	}

	suspend fun sceKernelAllocateVpl(uid: Int, size: Int, outPtr: Ptr32, timeoutPtr: Ptr32): Int {
		return _sceKernelAllocateVpl(uid, size, outPtr, timeoutPtr, doTry = false)
	}

	suspend fun sceKernelTryAllocateVpl(uid: Int, size: Int, outPtr: Ptr32): Int {
		return _sceKernelAllocateVpl(uid, size, outPtr, Ptr32(nullPtr), doTry = true)
	}

	fun sceKernelReferVplStatus(uid: Int, info: PtrStruct<SceKernelVplInfo>): Int {
		info.set(vpl(uid).getUpdatedInfo())
		return 0
	}

	fun sceKernelDeleteVpl(uid: Int): Int {
		vpls.freeById(uid)
		return 0
	}

	fun sceKernelFreeVpl(uid: Int, ptr: Int): Int {
		val vpl = vpl(uid)
		vpl.part.getAtLow(ptr.unsigned)?.unallocate()
		vpl.onFree(Unit)
		return 0
	}

	fun sceKernelCancelVpl(cpu: CpuState): Unit = UNIMPLEMENTED(0x1D371B8A)
	fun sceKernelAllocateVplCB(cpu: CpuState): Unit = UNIMPLEMENTED(0xEC0A693F)

	fun registerSubmodule() = tmodule.apply {
		registerFunctionInt("sceKernelCreateVpl", 0x56C039B5, since = 150) { sceKernelCreateVpl(istr, int, int, int, ptr) }
		registerFunctionSuspendInt("sceKernelAllocateVpl", 0xBED27435, since = 150) { sceKernelAllocateVpl(int, int, ptr32, ptr32) }
		registerFunctionSuspendInt("sceKernelTryAllocateVpl", 0xAF36D708, since = 150) { sceKernelTryAllocateVpl(int, int, ptr32) }
		registerFunctionInt("sceKernelReferVplStatus", 0x39810265, since = 150) { sceKernelReferVplStatus(int, ptr(SceKernelVplInfo)) }
		registerFunctionInt("sceKernelDeleteVpl", 0x89B3D48C, since = 150) { sceKernelDeleteVpl(int) }
		registerFunctionInt("sceKernelFreeVpl", 0xB736E9FF, since = 150) { sceKernelFreeVpl(int, int) }

		registerFunctionRaw("sceKernelCancelVpl", 0x1D371B8A, since = 150) { sceKernelCancelVpl(it) }
		registerFunctionRaw("sceKernelAllocateVplCB", 0xEC0A693F, since = 150) { sceKernelAllocateVplCB(it) }
	}

	class SceKernelVplInfo(
		var size: Int = SceKernelVplInfo.size,
		var name: String = "",
		var attr: Int = 0,
		var poolSize: Int = 0,
		var freeSize: Int = 0,
		var numWaitThreads: Int = 0
	) {
		companion object : Struct<SceKernelVplInfo>({ SceKernelVplInfo() },
			SceKernelVplInfo::size AS INT32,
			SceKernelVplInfo::name AS STRINGZ(32),
			SceKernelVplInfo::attr AS INT32,
			SceKernelVplInfo::poolSize AS INT32,
			SceKernelVplInfo::freeSize AS INT32,
			SceKernelVplInfo::numWaitThreads AS INT32
		)
	}
}
