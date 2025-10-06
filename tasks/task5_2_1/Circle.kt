// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circleParameter(radius: Double) = 2 * PI * radius

fun readDouble(prompt: String): Double {
    print(prompt)
    val input = readln().toDouble()
    return input
}

fun main() {
    val prompt = "Enter the radius of the circle: "
    val radius = readDouble(prompt)
    val area = circleArea(radius)
    val parameter = circleParameter(radius)

    println("The parameter of the circle is %.4f".format(parameter))
    println("The area of the circle is %.4f".format(area))
}