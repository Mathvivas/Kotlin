package br.maua.testes

import br.maua.Gerente
import br.maua.ImprimeRelatorio

fun main() {
    val gerente = Gerente("Mariana", "768954769806", 5000.0)
    ImprimeRelatorio.imprime(gerente)
}