// Task 13.3

// Implement your Money class here
data class Money(val euros: Int, val cents: Int) {
    init {
        require(euros >= 0) { "Euros cannot be negative" }
        require(cents >= 0) { "Cents cannot be negative" }
        require(cents < 100) { "Cents must be less than 100" }
    }

    operator fun plus(other: Money): Money {
        val totalCents = cents + other.cents
        val extraEuros = totalCents / 100
        val newCents = totalCents % 100
        val newEuros = euros + other.euros + extraEuros
        return Money(newEuros, newCents)
    }

}