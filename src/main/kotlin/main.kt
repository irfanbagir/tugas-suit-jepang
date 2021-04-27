var playerOne: String = ""
var playerTwo: String = ""
fun main(args: Array<String>) {
    headerGame()

}

fun headerGame() {
    println("Pilih Gunting Batu Kertas")
    println("Player One silahkan pilih")
    playerOne = readLine().toString().toLowerCase()
    when(playerOne) {
        "gunting" -> headerGame2()
        "batu" -> headerGame2()
        "kertas" -> headerGame2()

        else ->{
            println("Pilih antara gunting, batu atau kertas")
            headerGame()
        }
    }

}

fun headerGame2() {
    println("Player Two silahkan pilih")
    playerTwo = readLine().toString().toLowerCase()
    when(playerTwo) {
        "gunting" -> rumusSuit()
        "batu" -> rumusSuit()
        "kertas" -> rumusSuit()

        else ->{
            println("Pilih antara gunting, batu atau kertas")
            headerGame2()
        }
    }

}

fun rumusSuit() {
    if (playerOne == playerTwo) {
        println("Draw")
    } else if (playerOne == "gunting" && playerTwo == "kertas") {
        println("Player 1 Wins")
    } else if (playerOne == "batu" && playerTwo == "gunting") {
        println("Player 1 Wins")
    } else if (playerOne == "kertas" && playerTwo == "batu") {
        println("Player 1 Wins")
    } else {
        println("Player 2 Wins")
    }
}
