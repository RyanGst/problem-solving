package leetcode

class Solution {
    lateinit var A: IntArray
    lateinit var B: IntArray

    var memoizedSolutions: MutableMap<Pair<Int, Int>, Int>? = null

    fun maxUncrossedLines(A: IntArray, B: IntArray): Int {
        this.A = A
        this.B = B
        return maxUncrossedLines(0, 0)
    }

    private fun maxUncrossedLines(aIndex: Int, bIndex: Int): Int {
        if (memoizedSolutions == null) {
            memoizedSolutions = HashMap<Pair<Int, Int>, Int>()
        }
        val solutionKey = Pair(aIndex, bIndex)
        if (memoizedSolutions?.containsKey(solutionKey) ?: false) {
            return memoizedSolutions?.get(solutionKey) ?: 0
        }
        val maxUncrossedLines = if (aIndex >= A.size || bIndex >= B.size) {
            return 0
        } else if (A.get(aIndex) == B.get(bIndex)) {
            1 + maxUncrossedLines(aIndex + 1, bIndex + 1)
        } else {
            Math.max(maxUncrossedLines(aIndex + 1, bIndex), maxUncrossedLines(aIndex, bIndex + 1))
        }
        memoizedSolutions?.put(solutionKey, maxUncrossedLines)
        return maxUncrossedLines
    }
}