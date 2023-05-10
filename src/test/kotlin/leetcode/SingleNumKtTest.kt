package leetcode

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class SingleNumKtTest {

    @Test
    fun singleNumberTest() {

        val duplicate = singleNumber(intArrayOf(1, 2, 2))

        assertEquals(duplicate, 1)
    }
}