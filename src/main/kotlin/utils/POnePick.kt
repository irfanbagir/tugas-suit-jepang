package utils
var playerOne : String =""
class POnePick {
    fun pOnePick(){
        println("Player One silahkan pilih")
        playerOne = readLine().toString().toLowerCase()
        when(playerOne) {
            "gunting" -> PTwoPick().pTwoPick()
            "batu" -> PTwoPick().pTwoPick()
            "kertas" -> PTwoPick().pTwoPick()

            else ->{
                println("Anda tidak memilih antara gunting, batu atau kertas")
                pOnePick()
            }
        }

    }
}