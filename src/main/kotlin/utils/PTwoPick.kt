package utils
var playerTwo : String = ""

class PTwoPick {
    fun pTwoPick() {
    print("Player Two silahkan pilih :")
    playerTwo = readLine().toString().toLowerCase()
    when(playerTwo) {
        "gunting" -> RumusSuit().rumusSuit(playerOne, playerTwo)
        "batu" -> RumusSuit().rumusSuit(playerOne, playerTwo)
        "kertas" -> RumusSuit().rumusSuit(playerOne, playerTwo)

        else ->{
            println("Anda tidak memilih antara gunting, batu atau kertas")
            pTwoPick()
        }
    }

}
}