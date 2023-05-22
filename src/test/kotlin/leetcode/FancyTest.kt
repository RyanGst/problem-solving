package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FancyTest {

    @Test
    fun base() {
        var obj = Fancy()
        obj.append(2)
        obj.addAll(3)
        obj.append(7)
        obj.multAll(2)
        var param_4 = obj.getIndex(0)
    }

    @Test
    fun append() {
    }

    @Test
    fun addAll() {
    }

    @Test
    fun multAll() {
    }

    @Test
    fun getIndex() {
    }
}