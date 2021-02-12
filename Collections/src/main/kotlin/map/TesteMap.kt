package map

fun main() {
    var pair: Pair<String, Double> = Pair("Johnny", 4000.0)
    val map1 = mapOf(pair)

    map1.forEach { (key, value) -> println("Chave: $key - Valor: $value") }

    val map2 = mapOf("Hope" to 6000.0, "Panam" to 2000.0)

    map2.forEach { (key, value) -> println("Chave: $key - Valor: $value") }
}