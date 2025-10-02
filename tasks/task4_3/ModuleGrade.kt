import kotlin.system.exitProcess
import kotlin.math.roundToInt


fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Invalid number of arguments")
        exitProcess(1)
    }

    val total = (args[0].toDouble() + args[1].toDouble() + args[2].toDouble()) / 3

    val grade = when (total.roundToInt()) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "N/A"
    }   

    println("Mark: ${total.roundToInt()} grade: $grade")
}