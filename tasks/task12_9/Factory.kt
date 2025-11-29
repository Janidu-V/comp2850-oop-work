// Task 12.9: class implementing the Static Factory Method pattern

import java.time.LocalDate

class Person private constructor(val name: String, val birth: LocalDate) {
    companion object Factory {
        private val names = mutableListOf<String>()

        fun create(name: String, birth: LocalDate): Person {
            require(name !in names) { "Name must be unique" }
            names.add(name)
            return Person(name, birth)
        }
    }
}

fun main() {
    val p1 = Person.create("bob", LocalDate.of(1990, 1, 1))
    val p2 = Person.create("bob", LocalDate.of(1992, 2, 1))
}
