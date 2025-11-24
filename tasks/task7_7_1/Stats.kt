fun readData() = buildList {
    // Print a prompt for the user
    print("Enter a series of floating-point numbers (seperated by spaces): ")
    val dataSet = readln()

    // Write a loop to read the numbers
    // Inside this loop, call add() to add a number to list
    var ws = 1
    var we = 0
    var currentNum = ""
    for (char in dataSet) {
        if ((char == ' ') || (char.lowercaseChar() in 'a'..'z')) {
            ws = 1
            continue
        } else if ((ws == 1)) {
            if (currentNum.isNotEmpty()) {
                add(currentNum.toDouble())
            }
            currentNum = char.toString()
            ws = 0
        } else {
            currentNum += char
        }
    } 
    if (currentNum.isNotEmpty()) {
        add(currentNum.toDouble())
    }
}

fun median(data: List<Double>): Double {
    // Sorting the list
    val sortedData = data.sorted()
    val size = sortedData.size

    if (size % 2 == 1) {
        return sortedData[size / 2]
    } else {
        val mid1 = sortedData[size / 2 - 1]
        val mid2 = sortedData[size / 2]
        return (mid1 + mid2) / 2
    }
}

fun displayStats(data: List<Double>) {
    val max = data.max()
    val min = data.min()
    val mean = data.average()

    println("Min: $min")
    println("Max: $max")
    println("Mean: $mean")
    println("Median: ${median(data)}")
}

fun main() {
    val dataList = readData()
    displayStats(dataList)
}