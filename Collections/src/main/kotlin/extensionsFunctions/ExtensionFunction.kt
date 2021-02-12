package extensionsFunctions

import java.math.BigDecimal

// Possibilita estender uma classe adicionando novas funcionalidades

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if ( this.isEmpty() ) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()