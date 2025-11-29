// Task 15.2.3

fun main() {
    // Write your main program here
    val account = SavingsAccount("Bob", 1.8)
    account.deposit(1250)
    account.applyInterest()
    account.applyInterest()
    account.applyInterest()
    account.applyInterest()
    account.applyInterest()
    account.withdraw(50)
    println("Balance: ${account.balance}")
}
