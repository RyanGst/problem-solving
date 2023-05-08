package leetcode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    if (list1 == null) return list2
    if (list2 == null) return list1

    var l1 = list1
    var l2 = list2
    var result: ListNode? = null
    var current: ListNode? = null

    while (l1 != null && l2 != null) {
        if (l1.`val` < l2.`val`) {
            if (result == null) {
                result = l1
                current = result
            } else {
                current?.next = l1
                current = current?.next
            }
            l1 = l1.next
        } else {
            if (result == null) {
                result = l2
                current = result
            } else {
                current?.next = l2
                current = current?.next
            }
            l2 = l2.next
        }
    }

    if (l1 != null) {
        current?.next = l1
    }

    if (l2 != null) {
        current?.next = l2
    }

    return result
}