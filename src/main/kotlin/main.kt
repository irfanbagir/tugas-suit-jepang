var playerOne: String = ""
var playerTwo: String = ""
fun main(args: Array<String>) {
    headerGame()
    pOnePick()

}

fun headerGame() {
    println("====================================")
    println("==== Game Suit Terminal Version ====")
    println("====================================")
    println("Pilih Gunting Batu Kertas")
}
fun pOnePick(){
    println("Player One silahkan pilih")
    playerOne = readLine().toString().toLowerCase()
    when(playerOne) {
        "gunting" -> pTwoPick()
        "batu" -> pTwoPick()
        "kertas" -> pTwoPick()

        else ->{
            println("Anda tidak memilih antara gunting, batu atau kertas")
            pOnePick()
        }
    }

}

fun pTwoPick() {
    println("Player Two silahkan pilih")
    playerTwo = readLine().toString().toLowerCase()
    when(playerTwo) {
        "gunting" -> rumusSuit()
        "batu" -> rumusSuit()
        "kertas" -> rumusSuit()

        else ->{
            println("Anda tidak memilih antara gunting, batu atau kertas")
            pTwoPick()
        }
    }

}

fun rumusSuit() {
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
