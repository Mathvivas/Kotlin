package set

import classe.Funcionario

fun main() {
    val johnny = Funcionario("Johnny", 4000.0, "CLT")
    val hope = Funcionario("Hope", 6000.0, "PJ")
    val panam = Funcionario("Panam", 2000.0, "CLT")

    val funcionario1 = setOf(johnny, hope)
    val funcionario2 = setOf(panam)

    val resultUnion = funcionario1.union(funcionario2)

    resultUnion.forEach { println(it) }

    println()

    val funcionario3 = setOf(johnny, hope, panam)
    val resultSubtract = funcionario3.subtract(funcionario1)
    resultSubtract.forEach { println(it) }

    println()

    val resultIntersect = funcionario3.intersect(funcionario1)
    resultIntersect.forEach { println(it) }
}