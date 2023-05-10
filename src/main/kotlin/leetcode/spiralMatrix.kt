package leetcode

import kotlin.math.ceil

fun generateMatrix(n: Int): Array<IntArray> {

    if (n == 1) {
        return arrayOf(
            intArrayOf(1)
        )
    }

    var matrix = Array(n) {
        IntArray(n) { 0 }
    }

    var row = 0
    var col = 0
    var rowEnd = n -1
    var colEnd = n -1
    var counter = 1

    while (col <= colEnd && row <= rowEnd) {

        for (i in col..colEnd) {
            matrix[row][i] = counter
            counter += 1
        }

        row += 1;

        for (i in row..rowEnd) {
            matrix[i][colEnd] = counter
            counter += 1
        }


        colEnd -= 1

        for (i in colEnd downTo col) {
            matrix[rowEnd][i] = counter
            counter += 1
        }

        rowEnd -= 1

        for (i in rowEnd downTo row) {
            matrix[i][col] = counter
            counter += 1
        }

        col += 1
    }


    return matrix
}