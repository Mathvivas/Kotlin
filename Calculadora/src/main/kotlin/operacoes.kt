class Operacoes {

    fun primeiroValor(): Float {
        var primeiro: Float
        println("Digite o primeiro valor: ")
        primeiro = readLine()!!.toFloat()
    }

    fun segundoValor(): Float {
        var segundo: Float
        println("Digite o segundo valor: ")
        segundo = readLine()!!.toFloat()
    }

    fun soma() {
        var soma: Float
        var prim: Float
        var seg: Float

        println("====== SOMA ======")

        prim = Operacoes().primeiroValor()
        seg = Operacoes().segundoValor()
        soma = prim + seg

        println("${prim} + ${seg} = ${soma}")
    }

    fun substrac() {
        var sub: Float
        var prim: Float
        var seg: Float

        println("====== SUBTRAÇÃO ======")

        prim = Operacoes().primeiroValor()
        seg = Operacoes().segundoValor()
        sub = prim - seg

        println("${prim} - ${seg} = ${sub}")
    }

    fun multiplic() {
        var mult: Float
        var prim: Float
        var seg: Float

        println("====== MULTIPLICAÇÃO ======")

        prim = Operacoes().primeiroValor()
        seg = Operacoes().segundoValor()
        mult = prim * seg

        println("${prim} * ${seg} = ${mult}")
    }

    fun divid() {
        var div: Float
        var prim: Float
        var seg: Float

        println("====== DIVISÃO ======")

        prim = Operacoes().primeiroValor()
        seg = Operacoes().segundoValor()
        div = prim / seg

        println("${prim} / ${seg} = ${div}")
    }

    fun fatorial() {
        var fat: Float
        var prim: Float

        println("====== FATORIAL ======")

        prim = Operacoes().primeiroValor()


        println("${prim}! = ${fat}")
    }

    fun potenciac() {

    }
}