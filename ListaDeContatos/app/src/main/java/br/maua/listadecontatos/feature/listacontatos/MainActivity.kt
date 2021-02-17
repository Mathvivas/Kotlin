package br.maua.listadecontatos.feature.listacontatos

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import br.maua.listadecontatos.R
import br.maua.listadecontatos.application.ContatoApplication
import br.maua.listadecontatos.bases.BaseActivity
import br.maua.listadecontatos.feature.contato.ContatoActivity
import br.maua.listadecontatos.feature.listacontatos.adapter.ContatoAdapter
import br.maua.listadecontatos.feature.listacontatos.model.ContatosVO
import br.maua.listadecontatos.singleton.ContatoSingleton
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : BaseActivity() {
    private var adapter: ContatoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gerarListaDeContatos()
        setupToolBar(toolBar, "Lista de Contatos", false)
        setupListView()
        setupOnClicks()
    }

    private fun setupOnClicks() {
        fab.setOnClickListener { onClickAdd() }
        ivBuscar.setOnClickListener { onClickBuscar() }
    }

    private fun setupListView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ContatoAdapter(this, ContatoSingleton.lista) { onClickItemRecyclerView(it) }
        recyclerView.adapter = adapter
    }

    private fun gerarListaDeContatos() {
        ContatoSingleton.lista.add(ContatosVO(1, "Fulano", "(21) 9908-1121"))
        ContatoSingleton.lista.add(ContatosVO(2, "Ciclano", "(11) 9723-1234"))
        ContatoSingleton.lista.add(ContatosVO(3, "Bugano", "(40) 9996-8974"))
    }

    override fun onResume() {
        super.onResume()
        onClickBuscar()
    }

    private fun onClickAdd() {
        val intent = Intent(this, ContatoActivity::class.java)
        startActivity(intent)
    }

    private fun onClickItemRecyclerView(index: Int) {
        val intent = Intent(this, ContatoActivity::class.java)
        intent.putExtra("index", index)
        startActivity(intent)
    }

    private fun onClickBuscar(){
        val busca = etBuscar.text.toString()
        progress.visibility = View.VISIBLE
        Thread(Runnable {
            Thread.sleep(1500)
            var listaFiltrada: List<ContatosVO> = mutableListOf()
            try {
                listaFiltrada = ContatoApplication.instance.helperDB?.buscarContatos(busca) ?: mutableListOf()
            } catch (ex: Exception){
                ex.printStackTrace()
            }
            runOnUiThread {
                adapter = ContatoAdapter(this, listaFiltrada) {onClickItemRecyclerView(it)}
                recyclerView.adapter = adapter
                progress.visibility = View.GONE
                Toast.makeText(this,"Buscando por $busca", Toast.LENGTH_SHORT).show()
            }
        }).start()
    }

}