import utils.PlayerPick
import kotlin.system.exitProcess

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            headerGame()
            PlayerPick().playerOnePick()
            playAgain()
        }


        fun headerGame() {
            println("=========================")
            println("Game Suit Jepang Terminal")
            println("=========================")
            println("Pilih antara Gunting, Batu, Atau Kertas")
        }
        fun playAgain(){
            println()
            print("Main lagi?(Y/N):")
            if (readLine().equals("Y", ignoreCase = true)) {
                PlayerPick().playerOnePick()
            } else {
                println("Thanks for Playing!!")
                exitProcess(0)
            }
        }
    }
}