package comparacao

const val EQUAL = 0
const val LESS = -1
const val MORE = 1

fun main() {
    val x = 22
    val y = 95

    println(x > y)
    println(x.compareTo(y))
    println(x.compareTo(y) == MORE)
    println(x.compareTo(y) == LESS)
    println(x.compareTo(y) == EQUAL)
}