package com.soywiz.kpspemu.format

import com.soywiz.korio.async.syncTest
import com.soywiz.korio.stream.openSync
import com.soywiz.kpspemu.embedded.MinifireElf
import org.junit.Test

class ElfTest {
	@Test
	fun name() = syncTest {
		val elf = Elf.read(MinifireElf.openSync())
	}
}