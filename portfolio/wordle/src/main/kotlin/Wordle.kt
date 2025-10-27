// Implement the six required functions here
import java.io.File


fun isValid(word: String): Boolean {
    if (word.length != 5) {
        return false
    }

    for (char in word.lowercase()) {
        if (!(char in 'a'..'z')) {
            return false
        }
    }

    return true
}

fun readWordList(f: String): MutableList<String> = File(f).useLines { it.toMutableList() }


fun pickRandomWord(words: MutableList<String>): String = words.random()

fun obtainGuess(attempt: Int): String {
    var word = ""
    do {
        print("Attempt $attempt: ")
        word = readln()
    } while ( !(isValid(word)) )

    return word
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    val validList = mutableListOf(0, 0, 0, 0, 0)
    for (i in 0..4) {
        if (guess[i].uppercase() == target[i].uppercase()) {
            validList.set(i, 1)
        }
    }

    return validList.toList()
}

fun displayGuess(guess: String, matches: List<Int>) {
    var output = ""
    for (i in 0..4) {
        if (matches[i] == 1) {
            output += "${guess[i]} "
        } else {
            output += "? "
        }
    }

    println(output)
}

fun main() {
    val words = readWordList("data.txt")
    val randWord = pickRandomWord(words)
    println(randWord)
    val guess = obtainGuess(1)
    val list = evaluateGuess(guess, randWord)
    displayGuess(guess, list)
}