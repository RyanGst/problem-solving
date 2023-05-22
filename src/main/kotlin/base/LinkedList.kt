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
fun recursiveSearchNode(list: ListNode, x: Int): ListNode? {
    return when {
        list.`val` == x -> list
        list.next == null -> null
        else -> recursiveSearchNode(list.next!!, x)
    }
}
fun printNodes(list: ListNode) {
    println(list.`val`)
    list.next?.let { printNodes(it) }
}

fun searchNode(list: ListNode, x: Int): ListNode? {
    if(list.`val` == x) return list
    return list.next?.let { searchNode(it, x) }
}

fun appendNode(list: ListNode, x: Int): ListNode {
    if(list.next == null) {
        list.next = ListNode(x)
    } else {
        appendNode(list.next!!, x)
    }
    return list
}

fun removeListNodes(list: ListNode, x: Int): ListNode {
    if(list.`val` == x) {
        return list.next!!
    } else {
        list.next = removeListNodes(list.next!!, x)
    }
    return list
}