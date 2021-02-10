package br.maua

class Pessoa {
    var nome: String = "Matheus"
    var cpf: String = "123.123.123-11"
    //private var cpf: String = "123.123.123-11"    // Tanto o set, quanto o get são privados
    private set     // Somete o set é privado, o get é público
}

fun main() {
    val math = Pessoa()

    println(math.nome)
    println(math.cpf)

}