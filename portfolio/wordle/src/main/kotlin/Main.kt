const val MAX_ATTEMPTS = 6

fun main() {
    val wordList = readWordList("data/words.txt")
    val targetWord = pickRandomWord(wordList)
    var attempt = 1

    while (attempt <= MAX_ATTEMPTS) {
        val guess = obtainGuess(attempt)
        val validList = evaluateGuess(guess, targetWord)
        displayGuess(guess, validList)

        if (validList == listOf(2, 2, 2, 2, 2)) {
            println("You have succesfully guessed the correct word!")
            return
        }
        else {
            println("Wrong word. Try again\n")
            attempt += 1
        }
    }

    println("You have failed to guess the word within 10 guesses. Correct word was $targetWord")
}
