package leetcode


import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SingleNumKtTest {

    @Test
    fun singleNumberTest() {
        val duplicate = singleNumber(intArrayOf(1, 2, 2))

        assertEquals(duplicate, 1)
    }
}