package leetcode

import kotlin.math.max

fun mostPoints(questions: Array<IntArray>): Long {
    val n = questions.size
    val dp = LongArray(n) { 0 }
    dp[n - 1] = questions[n - 1][0].toLong()
    val start = n - 2
    for (i in start downTo  0) {
        dp[i] = questions[i][0].toLong()
        val skip = questions[i][1]

        if (i + skip + 1 < n)  dp[i] += dp[i + skip + 1];

        dp[i] = max(dp[i], dp[i + 1])
    }
    return dp[0]
}