import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)

    fun distanceTo(other: Point) = hypot(x - other.x, y - other.y)
}


fun main() {
    print("Enter x coordinate: ")
    val x = readln().toDouble()
    print("Enter y coordinate: ")
    val y = readln().toDouble()

    val p1 = Point(x, y)
    val p2 = Point(4.5, 7.0)

    println("Distance from origin: ${p1.distance()}")
    println("Distance to point (4.5, 7.0): ${p1.distanceTo(p2)}")
}