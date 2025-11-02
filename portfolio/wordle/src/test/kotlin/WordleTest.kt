import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    // Testing isValid
    "Word of length less than 5" {
        withClue("word=''") { isValid("") shouldBe false }
        withClue("word='hi'") { isValid("hi") shouldBe false }
        withClue("word='soft'") { isValid("soft") shouldBe false }
    }

    "Word of length 5" {
        withClue("word='hello'") { isValid("hello") shouldBe true }
        withClue("word='WORLD'") { isValid("WORLD") shouldBe true }
        withClue("word='HeLlo'") { isValid("HeLlo") shouldBe true }
    }

    "Word of length more than 5" {
        withClue("word='eleven'") { isValid("eleven") shouldBe false }
        withClue("word='helloWorld'") { isValid("helloWorld") shouldBe false }
    }

    "Word including numbers and symbols" {
        withClue("word='12345'") { isValid("12345") shouldBe false }
        withClue("word='he!lo'") { isValid("he!lo") shouldBe false }
    }

    // Testing readWordList
    "List of words from test_data.txt" {
        withClue("fileName='data/test_data.txt'") {
            readWordList("data/test_data.txt") shouldBe mutableListOf("HELLO", "WORLD", "SEVEN")
        }
    }

    "First word from words.txt" {
        withClue("fileName='data/words.txt'") { readWordList("data/words.txt")[0] shouldBe "ABACK" }
    }

    // Testing pickRandomWord
    "Picking the word from a list with one word" {
        withClue("words=['HELLO']") { pickRandomWord(mutableListOf("HELLO")) shouldBe "HELLO" }
        withClue("words=['WORLD']") { pickRandomWord(mutableListOf("WORLD")) shouldBe "WORLD" }
    }

    // Testing evaluateGuess
    "Guesses with no correct letters" {
        withClue("guess='HELLO', target='CURRY'") { evaluateGuess("HELLO", "CURRY") shouldBe listOf(0, 0, 0, 0, 0) }
        withClue("guess='world', target='FIGHT'") { evaluateGuess("world", "FIGHT") shouldBe listOf(0, 0, 0, 0, 0) }
    }

    "Guesses with some correct letters but in the wrong position" {
        withClue("guess='Hello', target='BLOWS'") { evaluateGuess("Hello", "BLOWS") shouldBe listOf(0, 0, 1, 1, 1) }
        withClue("guess='alert', target='LATER'") { evaluateGuess("alert", "LATER") shouldBe listOf(1, 1, 1, 1, 1) }
    }

    "Guesses with mixed correct letters in the right position, in the wrong position and incorrect letters" {
        withClue("guess='HELLO', target='WORLD'") { evaluateGuess("HELLO", "WORLD") shouldBe listOf(0, 0, 1, 2, 1) }
        withClue("guess='funny', target='BUFFY'") { evaluateGuess("funny", "BUFFY") shouldBe listOf(1, 2, 0, 0, 2) }
    }

    "Correct guesses" {
        withClue("guess='HELLO', target='HELLO'") { evaluateGuess("HELLO", "HELLO") shouldBe listOf(2, 2, 2, 2, 2) }
        withClue("guess='world', target='WORLD'") { evaluateGuess("world", "WORLD") shouldBe listOf(2, 2, 2, 2, 2) }
    }
})
