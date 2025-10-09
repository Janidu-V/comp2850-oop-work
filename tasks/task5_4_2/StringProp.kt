// Task 5.4.1: string extension function
import kotlin.system.exitProcess

val String.tooLong: Boolean get() = this.length > 20

fun main() {
    val input = readln()
    println(input.tooLong)
    exitProcess(1)
}