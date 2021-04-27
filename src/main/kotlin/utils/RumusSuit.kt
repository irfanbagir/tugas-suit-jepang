package utils

class RumusSuit {
    fun rumusSuit(playerOne: String, playerTwo: String) {
        if (playerOne == playerTwo) {
            println()
            println("Hasil:")
            println("Draw!")
        } else if (playerOne == "gunting" && playerTwo == "kertas") {
            println()
            println("Hasil:")
            println("Player 1 Wins!")
        } else if (playerOne == "batu" && playerTwo == "gunting") {
            println()
            println("Hasil:")
            println("Player 1 Wins!")
        } else if (playerOne == "kertas" && playerTwo == "batu") {
            println()
            println("Hasil:")
            println("Player 1 Wins!")
        } else {
            println()
            println("Hasil:")
            println("Player 2 Wins!")
        }
        println()
        print("Main lagi?(Y/N):")
        val a = readLine().toString().toLowerCase()
        if (a == "y"){
            POnePick().pOnePick()
        }
        else{
            println("Thanks for Playing!!")
        }
    }
}