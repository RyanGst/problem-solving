package samples

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzbuzzKtTest {
    @Test
    fun fizzbuzzTest() {
        val result = fizzbuzz(3)
        assertEquals(result, listOf("1", "2", "Fizz"))
    }

    @Test
    fun fizzbuzzTestWith15() {
        val result = fizzbuzz(15)
        assertEquals(result, listOf("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"))
    }
}