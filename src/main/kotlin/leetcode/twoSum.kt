package leetcode

fun twoSum(nums: IntArray, target: Int): Array<Int> {
    val map = HashMap<Int, Int>()

    for ((index, value) in nums.withIndex()) {
        val diff = target - value

        if (map.containsKey(diff)) {
            return arrayOf(map[diff]!!, index)
        }

        map[value] = index
    }

    return arrayOf()
}