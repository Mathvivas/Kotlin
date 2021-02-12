package array

fun main() {
    val nomes = Array(3) { "" }
    //val nomes = Array<String>(3) { "" }

    nomes[0] = "Delsin"
    nomes[1] = "Cole"
    nomes[2] = "Brent"

    nomes.forEach { nome -> println(nome) }

    println()
    nomes.sort()

    for ( nome in nomes ) { println(nome) }

    val nomes2 = arrayOf("Kessler", "Zeke", "Abigail")
    println()
    nomes2.forEach { nome -> println(nome) }
}