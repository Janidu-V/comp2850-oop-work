// Task 17.3: creating & using interfaces

// Add Printable interface here
interface Printable {
    fun print()
}

// Add Document class here
class Document(val fileName: String) : Printable {
    override fun print() {
        println("Printing document: $fileName")
    }
}

fun main() {
    val item: Printable = Document("info.txt")
    item.print()
}
