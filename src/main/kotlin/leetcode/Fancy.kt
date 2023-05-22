package leetcode

class Fancy() {
    private val MOD = 1_000_000_007
    var sequence = mutableListOf<Long>()
    fun append(`val`: Int) {
        sequence.add(`val`.toLong())
    }

    fun addAll(inc: Int) {
        sequence = sequence.map {
            it + inc
        }.toMutableList()
    }

    fun multAll(m: Int) {
        sequence = sequence.map { it * m }.toMutableList()
    }

    fun getIndex(idx: Int): Int {
        return sequence.elementAtOrElse(idx) { -1 }.toInt()
    }

}
