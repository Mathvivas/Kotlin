package set

import classe.Funcionario

fun main() {
    val johnny = Funcionario("Johnny", 4000.0, "CLT")
    val hope = Funcionario("Hope", 6000.0, "PJ")
    val panam = Funcionario("Panam", 2000.0, "CLT")

    val funcionarios = mutableSetOf(johnny, hope)
    funcionarios.add(panam)
    funcionarios.forEach { println(it) }

    println()

    funcionarios.remove(panam)
    funcionarios.forEach { println(it) }
}