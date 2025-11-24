// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess
import java.io.FileNotFoundException

fun main(args: Array<String>) {
    // Implement main program here
    try {
        val filename = args[0]
        val data = readData(filename)
        val variance = variance(data)
        println("Size: ${data.size} \nVariance: %.5f".format(variance))

    } catch (e: IllegalArgumentException) {
        println("Not enough data")
        exitProcess(1)

    } catch (e: IndexOutOfBoundsException) {
        println("Filename not provided")
        exitProcess(1)
    
    } catch (e: FileNotFoundException) {
        println("File ${args[0]} not found")
        exitProcess(1)

    } catch (e: Exception) {
        println("Some error has occured")
        exitProcess(1)
    }
}
