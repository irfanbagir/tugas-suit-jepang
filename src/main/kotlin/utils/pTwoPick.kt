package utils
var playerTwo : String = ""

class pTwoPick {
    fun pTwoPick() {
    println("Player Two silahkan pilih")
    playerTwo = readLine().toString().toLowerCase()
    when(playerTwo) {
        "gunting" -> rumusSuit().rumusSuit(playerOne, playerTwo)
        "batu" -> rumusSuit().rumusSuit(playerOne, playerTwo)
        "kertas" -> rumusSuit().rumusSuit(playerOne, playerTwo)

        else ->{
            println("Anda tidak memilih antara gunting, batu atau kertas")
            pTwoPick()
        }
    }

}
}