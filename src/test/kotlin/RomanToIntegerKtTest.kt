import org.junit.jupiter.api.Assertions.*

class RomanToIntegerKtTest {

    @org.junit.jupiter.api.Test
    fun romanToIntTest() {

        val result = romanToInt("III")
        assertEquals(3, result)

        var result2 = romanToInt("IV")
        assertEquals(4, result2)
    }
}