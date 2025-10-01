fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println(greet(args[0]))
    } else {
        println(greet("world"))
    }
}