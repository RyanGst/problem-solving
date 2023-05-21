package leetcode

import java.util.*

fun isPalindrome(s: String): Boolean {
    val withoutSpaces = s.toLowerCase().replace(Regex("[\\s\\p{Punct}]"), "")
    return withoutSpaces == withoutSpaces.reversed()
}
