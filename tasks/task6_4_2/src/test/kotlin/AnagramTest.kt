// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    "Two strings of different lengths are not anagrams" {
        withClue("string1='hi', string2='hii'") {("hi" anagramOf "hii") shouldBe false}
    }

    "An empty string is not an anagram of itself" {
        withClue("string1='', string2=''") {("" anagramOf "") shouldBe false}
    }

    "A non-empty string is an anagram of itself" {
        withClue("string1='a', string2='a'") {("a" anagramOf "a") shouldBe true}
        withClue("string1='lie', string2='lie'") {("lie" anagramOf "lie") shouldBe true}
    }

    "Two strings are anagrams if they contain the same characters in a different order" {
        withClue("string1='hello', string2='olleh'") {("hello" anagramOf "olleh") shouldBe true}
    }

    "Letter case is disregarded when comparing character sequences" {
        withClue("string1='bye', string2='BYE'") {("bye" anagramOf "BYE") shouldBe true}
        withClue("string1='hi', string2='Hi'") {("hi" anagramOf "Hi") shouldBe true}
    }
})
