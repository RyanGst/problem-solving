package samples

fun fizzbuzz(int: Int): List<String> {
    val reactions = mapOf(3 to "Fizz", 5 to "Buzz")

    return (1..int).map { number ->
        val reaction = reactions.filter { number % it.key == 0 }.values.joinToString("")
        reaction.ifEmpty { number.toString() }
    }
}