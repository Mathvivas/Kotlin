package array

fun main() {
    val values = intArrayOf(15, 2, 6, 9, 1, 18, 12)

    values.sort()

    values.forEach { values -> print("\t" + values) }
}