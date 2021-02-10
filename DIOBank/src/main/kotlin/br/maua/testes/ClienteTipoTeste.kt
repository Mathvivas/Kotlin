package br.maua.testes

import br.maua.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")
}