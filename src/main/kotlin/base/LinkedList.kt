package base

import definitions.ListNode

fun main() {
    val head = ListNode(5)
    head.next = ListNode(11)
    head.next!!.next = ListNode(15)
    printNodes(head)

    //println(searchNode(head, 11))
    recursiveSearchNode(head, 11)?.next?.let { println(it.`val`) }
    appendNode(head, 20)
    //printNodes(head)
}

fun printNodes(list: ListNode) {
    println(list.`val`)
    list.next?.let { printNodes(it) }
}

fun recursiveSearchNode(list: ListNode, x: Int): ListNode? {
    return when {
        list.`val` == x -> list
        list.next == null -> null
        else -> recursiveSearchNode(list.next!!, x)
    }
}

fun appendNode(list: ListNode, x: Int): ListNode {
    return when (list.next) {
        null -> {
            list.next = ListNode(x)
            list
        }

        else -> appendNode(list.next!!, x)
    }
}

fun removeListNodes(list: ListNode, x: Int): ListNode {
    return when (list.`val`) {
        x -> list.next!!
        else -> {
            list.next = removeListNodes(list.next!!, x)
            list
        }
    }
}