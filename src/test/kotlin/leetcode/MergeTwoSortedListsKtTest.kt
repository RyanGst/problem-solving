package leetcode

import definitions.ListNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MergeTwoSortedListsKtTest {

    @Test
    fun mergeTwoListsTest() {
        val result = mergeTwoLists(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(4)
                }
            },
            ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        )

        assertEquals(1, result?.`val`)
    }
}
