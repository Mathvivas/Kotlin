package br.maua.listadecontatos.application

import android.app.Application
import br.maua.listadecontatos.helpers.HelperDB

class ContatoApplication: Application() {
    var helperDB: HelperDB? = null
    private set

    companion object {
        lateinit var instance: ContatoApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        helperDB = HelperDB(this)
    }
}