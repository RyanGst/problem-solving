package samples

class Node(val value: Int, val left: Node? = null, val right: Node? = null)

fun main() {
    val root = Node(1, Node(2, Node(4), Node(5)), Node(3, Node(6), Node(7)))
    val result = traverse(root)
    println(result)
}

fun traverse(root: Node?): List<Int> {
    val result = mutableListOf<Int>()
    if (root == null) return result
    val queue = mutableListOf<Node>()
    queue.add(root)
    while (queue.isNotEmpty()) {
        val node = queue.removeAt(0)
        result.add(node.value)
        node.left?.let { queue.add(it) }
        node.right?.let { queue.add(it) }
    }
    return result
}