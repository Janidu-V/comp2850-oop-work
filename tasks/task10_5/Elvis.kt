// Task 10.3.2: another example of an explicit null check

fun printReversed(text: String?) {
    val result = text?.let{ it.reversed().uppercase() } ?: "???"
    println("Result: $result")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed(input)
}
