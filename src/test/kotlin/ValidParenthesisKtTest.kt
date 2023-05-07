import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ValidParenthesisKtTest {

    @Test
    fun isValidTest() {
        val result = isValid("()")
        assertTrue(result)

        val result2 = isValid("()[]{}")
        assertTrue(result2)


        val result3 = isValid("(]")
        assertFalse(result3)

    }
    @Test
    fun isValidAgainstMixedValues() {
        val result = isValid("([)]")
        assertFalse(result)
    }
}