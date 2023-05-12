package leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class maxCrossedLines {

    @Test
    fun maxUncrossedLines() {

        val result = Solution().maxUncrossedLines(
            intArrayOf(
                1, 4,2
            ),
            intArrayOf(
                1, 2,4
            )
        )

        assertEquals(2, result)
    }
}