class Menu() {

    fun menu():Int {
        println("|=======| MENU |=======")
        println("| 1 - Soma")
        println("|")
        println("| 2 - Substração")
        println("|")
        println("| 3 - Multiplicação")
        println("|")
        println("| 4 - Divisão")
        println("|")
        println("| 5 - Fatorial")
        println("|")
        println("| 6 - Potenciação")
        println("|")
        println("| 0 - Sair")
        println("|======================")

        println("\nDigite a operação desejada: ")
        val op = readLine()!!.toInt()

        return op
    }
}