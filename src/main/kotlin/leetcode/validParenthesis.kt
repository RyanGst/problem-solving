package leetcode

fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()

    val map = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )

    for (letter in s) {
        if (map.containsKey(letter)) {
            val top = if (stack.isEmpty()) '#' else stack.removeAt(stack.size - 1)
            if (top != map[letter]) return false
        } else {
            stack.add(letter)
        }
    }

    return stack.isEmpty()
}