// Task 12.4.1: main program

fun main() {
    val circle = Circle(Point(0.0, 0.0), 5.0)
    val pointInside = Point(3.0, 4.0)
    val pointOutside = Point(6.0, 8.0)

    println("Circle area: ${circle.area()}")
    println("Circle perimeter: ${circle.perimeter()}")
    println("Point (3,4) inside circle: ${circle contains pointInside}")
    println("Point (6,8) inside circle: ${circle contains pointOutside}")
}
