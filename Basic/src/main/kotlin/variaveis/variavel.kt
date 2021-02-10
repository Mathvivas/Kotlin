package variaveis

const val MAX_AGE = 70

fun main() {
    val nome:String     // Para declarar uma variável, é necessário definir o tipo
    var idade = 30

    println(idade)
    idade = 40
    println(idade)

    nome = "Math"
    println(nome)

    // É possível modificar o valor de var, mas não o tipo
    var ano = "ano"
    // ano = 2021   -->    Erro
    println(ano)
    ano = 2021.toString()
    println(ano)

    /*
    Qualquer tipo pode ser nulo, porém isso deveser explicitado na
    dealaração da variável através do uso da interrogação
*/
    var month:Int? = null

    // var day:Int = null   -->     Erro de compilação

}
