package array

fun main() {
    val values = IntArray(5)       // Precisa de um tamanho

    values[0] = 1
    values[1] = 9
    values[2] = 7
    values[3] = 3
    values[4] = 2

    for ( valor in values ) {
        print("\t" + valor)
    }

    print("\n")

    values.forEach { valor -> print("\t" + valor) }

    print("\n")

    values.sort()
    for ( index in values.indices ) {
        print("\t" + values[index])
    }
}