package repeticao

fun main() {

    downTo()
    println()

    until()
    println()

    step(4)
    println()

    letters()
}

fun downTo() {
    for ( i in 20 downTo 0 ) {
        print("$i ")
    }
}

fun until() {
    for ( i in 0 until 20 ) {
        print("$i ")
    }
}

fun step(num:Int) {
    for ( i in 0 .. 20 step num ) {
        print("$i ")
    }
}

fun letters() {
    val arr = "Olha essa string!"
    for ( letter in arr ) {
        println(letter.toUpperCase())
    }
}