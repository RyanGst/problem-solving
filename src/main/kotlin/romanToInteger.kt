

fun romanToInt(s: String): Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var result = 0

    for ((i, letter) in s.withIndex()) {
        val current = map[letter] ?: 0
        val next = if (i + 1 < s.length) map[s[i + 1]] ?: 0 else 0

        if (current < next) {
            result -= current
        } else {
            result += current
        }
    }

    return result
}