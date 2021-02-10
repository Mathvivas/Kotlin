package br.maua.testes

import br.maua.Analista
import br.maua.ImprimeRelatorio

fun main() {
    val analista = Analista("João", "12345454534", 2000.0)
    ImprimeRelatorio.imprime(analista)
}
