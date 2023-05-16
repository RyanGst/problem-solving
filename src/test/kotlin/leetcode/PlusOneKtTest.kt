package leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PlusOneKtTest {
    @Test
    fun base() {
        val result = plusOne(
            intArrayOf(9)
        )

        assertArrayEquals(
            intArrayOf(1, 0),
            result
        )

    }

    @Test
    fun stringTest() {
        val result = plusOne(
            intArrayOf(1, 2, 3)
        )

        assertArrayEquals(
            intArrayOf(1, 2, 4),
            result
        )
    }
}