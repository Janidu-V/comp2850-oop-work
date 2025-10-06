// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun rollDice(numDices: Int = 1, sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        for (i in 1..numDices) {  
            println("Rolling a d$sides...")
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result \n")
        }

    } else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun main() {
    rollDice()
    rollDice(2)
    rollDice(5, 10)
    rollDice(sides=20)
    rollDice(numDices=3, sides=12)
    rollDice(5, sides=9)
    rollDice(sides=4, numDices=10)
}