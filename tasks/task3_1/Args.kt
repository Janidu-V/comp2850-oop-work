import kotlin.system.exitProcess


// Task 3.1: command line arguments
fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Invalid arguments")
        exitProcess(1)
    }
    
    println(args[0])
    println(args[1])
}