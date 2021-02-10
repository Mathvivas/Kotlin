class Sistema {

    fun run() {

        var op: String?

        do {
            op = Menu().menu()

            when (op) {
                "1" -> { Operacoes().soma() }
                "2" -> { Operacoes().subtrac() }
                "3" -> { Operacoes().multiplic() }
                "4" -> { Operacoes().divid() }
                "5" -> { Operacoes().fatorial() }
                "6" -> { Operacoes().potenciac() }
                "0" -> { println("Obrigado por utilizar a calculadora!") }
                else -> { println("Valor não existe no Menu, tente novamente!") }
            }

        } while (op != "0")
    }
}