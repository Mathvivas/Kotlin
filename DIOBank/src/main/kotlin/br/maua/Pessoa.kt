package br.maua

class Pessoa {
    var nome: String = "Matheus"
    var cpf: String = "123.123.123-11"
    //private var cpf: String = "123.123.123-11"    // Tanto o set, quanto o get são privados
    private set     // Somente o set é privado, o get é público

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val math = Pessoa()

    println(math.nome)
    println(math.cpf)
    println(math.pessoaInfo())

}