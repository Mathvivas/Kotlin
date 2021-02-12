package map

import classe.Funcionario
import classe.Repositorio

fun main() {
    val johnny = Funcionario("Johnny", 4000.0, "CLT")
    val hope = Funcionario("Hope", 6000.0, "PJ")
    val panam = Funcionario("Panam", 2000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(johnny.nome, johnny)
    repositorio.create(hope.nome, hope)
    repositorio.create(panam.nome, panam)

    println(repositorio.findById(johnny.nome))

    println()

    repositorio.findAll().forEach { valor -> println(valor) }

    println()

    repositorio.remove(panam.nome)
    repositorio.findAll().forEach { println(it) }
}