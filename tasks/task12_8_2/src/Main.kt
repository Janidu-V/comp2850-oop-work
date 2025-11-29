// Task 12.8.2: program to manipulate playing cards

fun main() {
    val cards = mutableListOf<Card>() 

    for (suit in Suit.entries) {
        for (rank in Rank.entries) {
            cards.add(Card(rank, suit))
        }
    }

    cards.shuffle()

    for (card in cards) {
        println("${card.fullName} -> $card")
    }
}
