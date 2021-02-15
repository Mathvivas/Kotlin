package br.maua.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
        Log.w("lifecycle", "entrei no CREATE - estou criando a tela")
        // printado no Logcat
    }

    private fun setListeners() {
        alturaEDT?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }

        pesoEDT?.doOnTextChanged { text, _, _, _ ->
            titleTXT?.text = text
        }

        calcularBTN?.setOnClickListener {
            calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
        }
    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if ( peso != null && altura != null ) {
            val imc = peso / (altura * altura)
            titleTXT.text = "Seu IMC é %.2f".format(imc)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "entrei no START - deixei a tela visível para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "entrei no RESUME - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "entrei no PAUSE - a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle", "entrei no STOP - a tela não está mais visível, mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "entrei no RESTART - a tela está retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle", "entrei no DESTROY - a tela foi destruída")
    }
}