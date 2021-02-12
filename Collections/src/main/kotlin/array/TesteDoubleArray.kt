package array

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 3000.0
    salarios[1] = 1000.0
    salarios[2] = 5000.0

    salarios.forEach { salario -> println(salario) }

    println()

    salarios.forEachIndexed { index, salario -> salarios[index] = salario * 1.5 }
    salarios.forEach { salario -> println(salario) }

    println()

    val salarios2 = doubleArrayOf(2250.0, 4470.0, 990.0)
    salarios2.sort()
    salarios2.forEach { salario -> println(salario) }
}