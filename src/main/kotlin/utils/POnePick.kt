package utils
var playerOne : String =""
class pOnePick {
    fun pOnePick(){
        println("Player One silahkan pilih")
        playerOne = readLine().toString().toLowerCase()
        when(playerOne) {
            "gunting" -> pTwoPick().pTwoPick()
            "batu" -> pTwoPick().pTwoPick()
            "kertas" -> pTwoPick().pTwoPick()

            else ->{
                println("Anda tidak memilih antara gunting, batu atau kertas")
                pOnePick()
            }
        }

    }
}