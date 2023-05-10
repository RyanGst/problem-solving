package leetcode

fun singleNumber(nums: IntArray): Int {

    var answer = 0

    for (i in 0 until nums.size) {
        answer = answer xor nums[i]
    }

    return answer
}