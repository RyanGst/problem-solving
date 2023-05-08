package leetcode

import leetcode.twoSum
import org.junit.jupiter.api.Assertions.*

class TwoSumKtTest {

    @org.junit.jupiter.api.Test
    fun twoSumTest() {

        val result = twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertArrayEquals(arrayOf(0, 1), result)

    }
}