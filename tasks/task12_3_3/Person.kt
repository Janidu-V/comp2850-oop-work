// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth))

    init {
     require(name.isNotBlank()) { "Name cannot be blank" }
    }
}

fun main() {
    print("Enter name: ")
    val name = readLine()!!
    print("Enter birth date (YYYY-MM-DD): ")
    val birth = readLine()!!
    val person = Person(name, birth)
    println("Name: ${person.name}, Birth Date: ${person.birth}, Is Married: ${person.isMarried}")
}