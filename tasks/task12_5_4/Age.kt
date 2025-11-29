// Task 12.5.4: class with a computed property
import java.time.temporal.ChronoUnit.YEARS
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    val age get() = YEARS.between(birth, LocalDate.now()).toInt()
}

fun main() {
    val person = Person("Bob", LocalDate.of(2001, 9, 12))
    println("Age: ${person.age}")
}