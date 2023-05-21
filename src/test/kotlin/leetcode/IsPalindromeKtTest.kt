package leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class IsPalindromeKtTest {

    @Test
    fun base() {
        val _return = isPalindrome("A man, a plan, a canal: Panama")
        assertEquals(true, _return)
    }


    @Test
    fun falseCase() {
        val _return = isPalindrome("race a car")
        assertEquals(false, _return)
    }

    @Test
    fun cornerCase() {
        val _return = isPalindrome("")
        assertEquals(true, _return)
    }
}