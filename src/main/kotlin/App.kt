import utils.PlayerPick

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            headerGame()
            PlayerPick().playerOnePick()
        }


        fun headerGame() {
            println("=========================")
            println("Game Suit Jepang Terminal")
            println("=========================")
            println("Pilih antara Gunting, Batu, Atau Kertas")
        }
    }
}