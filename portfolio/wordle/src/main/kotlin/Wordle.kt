// Implement the six required functions here
import java.io.File

const val MAX_LENGTH = 5
const val YELLOW = "\u001b[33m"
const val GREEN = "\u001b[32m"
const val DEFAULT = "\u001b[0m"

fun isValid(word: String): Boolean {
    var result = true
    if (word.length != MAX_LENGTH) {
        return false
    }

    for (char in word.lowercase()) {
        if (!(char in 'a'..'z')) {
            result = false
        }
    }

    return result
}

fun readWordList(f: String): MutableList<String> = File(f).useLines { it.toMutableList() }

fun pickRandomWord(words: MutableList<String>): String = words.random()

fun obtainGuess(attempt: Int): String {
    var word = ""
    do {
        print("Attempt $attempt: ")
        word = readln()
    } while (!(isValid(word)))

    return word
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    val validList = mutableListOf(0, 0, 0, 0, 0)
    for (i in 0..(MAX_LENGTH - 1)) {
        if (guess[i].uppercase() == target[i].uppercase()) {
            validList.set(i, 2)
        } else if (guess[i].uppercase() in target.uppercase()) {
            validList.set(i, 1)
        }
    }

    return validList.toList()
}

fun displayGuess(guess: String, matches: List<Int>) {
    var output = ""
    for (i in 0..(MAX_LENGTH - 1)) {
        if (matches[i] == 2) {
            output += GREEN + "${guess[i]}"
        } else if (matches[i] == 1) {
            output += YELLOW + "${guess[i]}"
        } else {
            output += DEFAULT + "${guess[i]}"
        }
    }

    println(output + DEFAULT)
}
