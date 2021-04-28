package utils

lateinit var inputplayerOne: String
lateinit var inputplayerTwo: String

class PlayerPick {

    fun playerOnePick() {
        print("Player One silahkan pilih :")
        inputplayerOne = readLine().toString().toLowerCase()
        when (inputplayerOne) {
            "gunting" -> playerTwoPick()
            "batu" -> playerTwoPick()
            "kertas" -> playerTwoPick()

            else -> {
                println("Anda tidak memilih antara gunting, batu atau kertas")
                playerOnePick()
            }
        }

    }

    private fun playerTwoPick() {
        print("Player Two silahkan pilih :")
        inputplayerTwo = readLine().toString().toLowerCase()
        when (inputplayerTwo) {
            "gunting" -> RumusSuit().rumusSuit(inputplayerOne, inputplayerTwo)
            "batu" -> RumusSuit().rumusSuit(inputplayerOne, inputplayerTwo)
            "kertas" -> RumusSuit().rumusSuit(inputplayerOne, inputplayerTwo)

            else -> {
                println("Anda tidak memilih antara gunting, batu atau kertas")
                playerTwoPick()
            }
        }

    }
}


