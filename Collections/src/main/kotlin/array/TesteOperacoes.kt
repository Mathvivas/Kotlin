package array

fun main() {
    val salarios = doubleArrayOf(1400.0, 2750.0, 4600.0)

    salarios.forEach { salario -> println(salario) }

    println()

    println("Maior Salário: ${salarios.maxOrNull()}")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média Salarial: ${salarios.average()}")

    println()

    val salarioMaiorQue = salarios.filter { it > 2500.0 }
    salarioMaiorQue.forEach { println(it) }

    println()

    println("count = " + salarios.count { it in 2000.0..5000.0 })

    println()

    println("find = " + salarios.find { it == 2750.0 })
    println("find = " + salarios.find { it == 3200.0 })
    println("any = " + salarios.any { it == 1400.0 })
    println("any = " + salarios.any { it == 1000.0 })
}