package br.maua.testes

import br.maua.Analista
import br.maua.Funcionario

fun main() {
    val analista = Analista("João", "12345454534", 2000.0)
    imprimeRelatorio(analista)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())