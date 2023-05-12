package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MostPointsKtTest {

    @Test
    fun mostPointsTest() {
        val result = mostPoints(
            arrayOf(
                intArrayOf(3,2),
                intArrayOf(4,3),
                intArrayOf(4, 4),
                intArrayOf(2, 5),
            )
        )

        assertEquals(5, result)
    }
}