// Task 4.5: summing odd integers with a for loop
fun main() {
    print("Enter the number: ")
    val upper = readln().toLong()
    var total = 0L

    for (i in 1..(upper)) {
        total += i
    }

    println(total)
}