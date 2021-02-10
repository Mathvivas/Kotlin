class Sistema {

    fun run() {

        var op: String?
        var primeiroValor: Float
        var segundoValor: Float

        do {
            op = Menu().menu()

            when (op) {
                "1" -> { soma() }
                "2" -> { subtrac() }
                "3" -> { multiplic() }
                "4" -> { divid() }
                "5" -> { fatorial() }
                "6" -> { potenciac() }
                "0" -> { println("Obrigado por utilizar a calculadora!") }
                else -> { println("Valor não existe no Menu, tente novamente!") }
            }

        } while (op != "0")
    }
}