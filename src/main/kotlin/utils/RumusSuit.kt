package utils

class RumusSuit {
    fun rumusSuit(playerOne: String, playerTwo: String) {
        if (playerOne == playerTwo) {
            println("Hasil")
            println("Draw")
        } else if (playerOne == "gunting" && playerTwo == "kertas") {
            println("Hasil")
            println("Player 1 Wins")
        } else if (playerOne == "batu" && playerTwo == "gunting") {
            println("Hasil")
            println("Player 1 Wins")
        } else if (playerOne == "kertas" && playerTwo == "batu") {
            println("Hasil")
            println("Player 1 Wins")
        } else {
            println("Hasil")
            println("Player 2 Wins")
        }
    }
}