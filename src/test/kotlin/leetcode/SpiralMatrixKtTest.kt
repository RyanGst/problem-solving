package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SpiralMatrixKtTest {

    @Test
    fun generateMatrixTest() {
        val matrix = generateMatrix(3)

        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(8, 9, 4),
                intArrayOf(7, 6, 5),
            ), matrix
        )
    }

    @Test
    fun generateMatrixTest2() {
        val matrix = generateMatrix(4)

        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 2, 3, 4),
                intArrayOf(12, 13, 14, 5),
                intArrayOf(11, 16, 15, 6),
                intArrayOf(10, 9, 8, 7),
            ), matrix
        )
    }

    @Test
    fun matrixWith1() {
        val matrix = generateMatrix(1)

        assertArrayEquals(
            arrayOf(
                intArrayOf(1),

                ), matrix
        )
    }
}