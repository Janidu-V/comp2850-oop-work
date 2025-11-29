// Task 12.8.1: example of an enum class

enum class Day {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

fun main() {
    println("--Options--")
    for (x in Day.entries) {
        println(x.name)
    }
    print("Enter a day: ")
    val input = readLine()!!
    println(input)

    val day = Day.valueOf(input)
}