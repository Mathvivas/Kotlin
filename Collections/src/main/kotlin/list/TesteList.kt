package list

import classe.Funcionario

fun main() {
    val johnny = Funcionario("Johnny", 4000.0, "CLT")
    val hope = Funcionario("Hope", 6000.0, "PJ")
    val panam = Funcionario("Panam", 2000.0, "CLT")

    val funcionarios = listOf(johnny, hope, panam)

    funcionarios.forEach { println(it) }

    println()

    println("Find:")
    println(funcionarios.find { it.nome == "Johnny" })

    println()

    println("Sort por Salário:")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println()

    println("Group By:")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}
