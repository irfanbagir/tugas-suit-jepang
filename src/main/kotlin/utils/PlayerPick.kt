package utils

lateinit var playerOne: String
lateinit var playerTwo: String

class PlayerPick {
    fun pOnePick() {
        print("Player One silahkan pilih :")
        playerOne = readLine().toString().toLowerCase()
        when (playerOne) {
            "gunting" -> pTwoPick()
            "batu" -> pTwoPick()
            "kertas" -> pTwoPick()

            else -> {
                println("Anda tidak memilih antara gunting, batu atau kertas")
                pOnePick()
            }
        }

    }

    fun pTwoPick() {
        print("Player Two silahkan pilih :")
        playerTwo = readLine().toString().toLowerCase()
        when (playerTwo) {
            "gunting" -> RumusSuit().rumusSuit(playerOne, playerTwo)
            "batu" -> RumusSuit().rumusSuit(playerOne, playerTwo)
            "kertas" -> RumusSuit().rumusSuit(playerOne, playerTwo)

            else -> {
                println("Anda tidak memilih antara gunting, batu atau kertas")
                pTwoPick()
            }
        }

    }
}


