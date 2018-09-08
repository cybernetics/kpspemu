package com.soywiz.kpspemu.cpu

class Breakpoints {
    private val breakpoints = LinkedHashMap<Int, Boolean>()
    var enabled: Boolean = false; private set

    fun reset() {
        clear()
    }

    fun clear() {
        breakpoints.clear()
        updateEnabled()
    }

    operator fun get(addr: Int) = enabled && breakpoints.getOrElse(addr) { false }

    operator fun set(addr: Int, enable: Boolean) {
        if (enable) {
            breakpoints[addr] = enable
        } else {
            breakpoints.remove(addr)
        }
        updateEnabled()
    }

    fun toggle(addr: Int) {
        this[addr] = !this[addr]
    }

    private fun updateEnabled() {
        enabled = breakpoints.size != 0
    }

    fun copyFrom(src: Breakpoints) {
        this.breakpoints.putAll(src.breakpoints)
        updateEnabled()
    }
}