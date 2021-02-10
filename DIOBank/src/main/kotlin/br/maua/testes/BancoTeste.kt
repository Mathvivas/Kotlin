package br.maua.testes

import br.maua.Banco

fun main() {
    val dio = Banco("DigitalInnovationBank", 12)
    val dio2 = Banco(numero = 13, nome = "DIO2")

    println(dio.nome)
    println(dio.numero)


}