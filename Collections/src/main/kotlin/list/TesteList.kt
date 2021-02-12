package list

fun main() {
    val johnny = Funcionario("Johnny", 4000.0)
    val hope = Funcionario("Hope", 6000.0)
    val panam = Funcionario("Panam", 2000.0)

    val funcionarios = listOf(johnny, hope, panam)

    funcionarios.forEach { println(it) }

    println()

    println("find:")
    println(funcionarios.find { it.nome == "Johnny" })

    println()

    println("sort por salário:")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
}

data class Funcionario(val nome: String, val salario: Double) {
    override fun toString(): String =
        """
        Nome: $nome
        Salário: $salario
        """.trimIndent()
}