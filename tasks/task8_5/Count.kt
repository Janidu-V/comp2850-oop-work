fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}

fun main() {
    val text = "Hello, World!"
    val vowelsCount = text.howMany { it.lowercaseChar() in "aeiou" }
    val uppercaseCount = text.howMany { it.isUpperCase() }
    val digitsCount = text.howMany { it.isDigit() }
    println("Number of vowels: $vowelsCount")
    println("Number of uppercase letters: $uppercaseCount")
    println("Number of digits: $digitsCount")
}