// Task 12.5.3: class with a custom setter

import java.time.LocalDate

class Person(_name: String, val birth: LocalDate) {
    var isMarried = false

    var name = _name
        set(value) {
            require(value.isNotBlank()) { "Name cannot be blank" }
            field = value
        }
}

fun main() {
    val person = Person("Alice", LocalDate.of(1990, 1, 1))
    println(person.name)

    person.name = ""
}