// Task 7.7.2: contact database, using a map

fun getPhone(): String {
    print("Enter the phone number: ")
    val phone = readln()
    return phone
}

fun main() {
    val contacts = mutableMapOf<String, String> ()

    while (true) {
        print("Enter the contact name: ")
        val contact = readln()
        if (contacts[contact] != null) {
            println("The phone number of $contact is ${contacts[contact]}")
            continue
        }
        val phone = getPhone()
        contacts[contact] = phone
        println("New phone number for $contact saved")
    }
}