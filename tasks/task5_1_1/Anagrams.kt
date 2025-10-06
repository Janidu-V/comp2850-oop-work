// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) { 
        return false 
    } 
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main() {
    print("Enter the first string: ")
    val first = readln()
    print("Enter the second string: ")
    val second = readln()

    val result = anagrams(first, second)
    if (result) {
        println("The strings are anagrams!")
    } else {
        println("The strings are not anagrams!")
    }
}