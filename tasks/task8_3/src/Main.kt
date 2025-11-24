// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    //   - Find records with lowest and and highest temperatures
    //   - Compute average temperature
    //   - Display all of these statistics
    val data = fetchData()
    val minTemp = data.minBy {it.second}
    val maxTemp = data.maxBy {it.second}
    val avgTemp = data.map {it.second}.average()
    println("Lowest temperature: ${minTemp.second} on ${minTemp.first}")
    println("Highest temperature: ${maxTemp.second} on ${maxTemp.first}")
    println("Average temperature: %.2f".format(avgTemp))
}
