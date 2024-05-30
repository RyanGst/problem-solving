package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LongestCommonPrefixKtTest {

    @Test
    fun longestCommonPrefixTest() {
        val common = longestCommonPrefix(arrayOf("flower", "flow", "flight"))
        assertEquals("fl", common)

        val common2 = longestCommonPrefix(arrayOf("dog", "racecar", "car"))
        assertEquals("", common2)

        val common3 = longestCommonPrefix(arrayOf("a"))
        assertEquals("a", common3)
    }
}