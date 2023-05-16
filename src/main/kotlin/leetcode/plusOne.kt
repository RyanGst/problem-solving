package leetcode

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }

        digits[i] = 0
    }

    val digits2 = IntArray(digits.size + 1) { 0 }

    digits2[0] = 1
    return digits2
}