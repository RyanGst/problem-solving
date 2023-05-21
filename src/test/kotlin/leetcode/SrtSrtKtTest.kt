package leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SrtSrtKtTest {

    @Test
    fun base() {
        val result = strStr("sadbutsad", "sad")
        assertEquals(
            0, result
        )
    }

    @Test
    fun empty() {
        val result = strStr("leetcode", "leeto")
        assertEquals(
            -1, result
        )
    }
}