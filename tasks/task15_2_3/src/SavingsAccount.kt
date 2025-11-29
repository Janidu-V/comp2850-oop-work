// Task 15.2.3

// Implement SavingsAccount class here
class SavingsAccount(holder: String, val rate: Double): BankAccount(holder) {
    fun applyInterest() {
        val interest = (balance * (rate / 100)).toInt()
        deposit(interest)
    }
}