package leetcode

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    var prefix = strs[0]

    // start at 1 because 0 it's our prefix
    for (i in 1 until strs.size) {
        // remove one letter from prefix
        while (strs[i].indexOf(prefix) != 0) prefix = prefix.substring(0, prefix.length - 1)
        if (prefix.isEmpty()) return ""
    }
    return prefix
}