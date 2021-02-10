class Operacoes {

    fun primeiroValor(): Float {
        var primeiro: Float
        println("Digite o primeiro valor: ")
        primeiro = readLine()!!.toFloat()

        return primeiro
    }

    fun segundoValor(): Float {
        var segundo: Float
        println("Digite o segundo valor: ")
        segundo = readLine()!!.toFloat()

        return segundo
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

    fun subtrac() {
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
        var fat = 1
        var prim: Int

        println("====== FATORIAL ======")

        println("Digite um valor inteiro: ")
        prim = readLine()!!.toInt()

        for ( i in prim downTo 2 ) { fat *= i }

        println("${prim}! = ${fat}")
    }

    fun potenciac() {
        var pot: Double
        var prim: Double
        var seg: Double

        println("====== POTENCIAÇÃO ======")

        println("Digite um valor inteiro: ")
        prim = readLine()!!.toDouble()
        println("Digite a potência: ")
        seg = readLine()!!.toDouble()

        pot = Math.pow(prim, seg)

        println("${prim}^${seg} = ${pot}")
    }
}