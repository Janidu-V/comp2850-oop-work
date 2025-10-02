fun main() {
    print("Choose pizza (a,b,c,d): ")
    val userInput = readln().lowercase()

    if (userInput.length == 1 && userInput in "a".."d") {
        println("Order accepted")
    } else {
        println("Invalid option")
    }
}