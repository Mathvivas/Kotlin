package br.maua

class Pessoa {
    var nome: String = "Matheus"
    var cpf: String = "123.123.123-11"
}

fun main() {
    val math = Pessoa()

    println(math.nome)
    println(math.cpf)
}