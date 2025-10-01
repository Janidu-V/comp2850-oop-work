fun greet(word: String): String {
    val greeting = setOf("hi", "bye", "67").random()
    return "$greeting $word!"
}