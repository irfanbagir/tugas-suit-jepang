var playerOne: String = ""
var playerTwo: String = ""
fun main(args: Array<String>) {
    headerGame()
    rumusSuit()
}

fun headerGame() {
    println("Pilih Gunting Batu Kertas")
    println("Player One silahkan pilih")
    playerOne = readLine().toString().toLowerCase()
    if (playerOne == "") {
        println("Pilih antara gunting batu dan kertas")
        headerGame()
    } else {
        headerGame2()
    }


}

fun headerGame2() {
    println("Player Two silahkan pilih")
    playerTwo = readLine().toString().toLowerCase()
    if (playerTwo == ""){
        println("pilih salah satu")
        headerGame2()
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
        println("Player Two Wins")
    }
}
