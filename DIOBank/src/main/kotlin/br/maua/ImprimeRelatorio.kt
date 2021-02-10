package br.maua

class ImprimeRelatorio {
    companion object {      // Permite ser invocado via classe, não instância
        fun imprime(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}