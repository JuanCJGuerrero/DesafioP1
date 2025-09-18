package br.unisanta.teste.controller

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.unisanta.teste.R
import br.unisanta.teste.model.Contato

class MainActivity : AppCompatActivity() {
    companion object {
        val listaContatos = mutableListOf<Contato>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNome = findViewById<EditText>(R.id.etNome)
        val etValor = findViewById<EditText>(R.id.etValor)
        val etImagem = findViewById<EditText>(R.id.etImagem)
        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)
        val tvVerLista = findViewById<TextView>(R.id.tvVerLista)

        btnCadastrar.setOnClickListener {
            val nome = etNome.text.toString().trim()
            val telefone = etValor.text.toString().trim()
            val img = etImagem.text.toString().trim()

            if (nome.isEmpty() || telefone.isEmpty() || img.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else {
                listaContatos.add(Contato(nome, telefone, img))
                Toast.makeText(this, "Contato cadastrado!", Toast.LENGTH_SHORT).show()
                etNome.text.clear()
                etValor.text.clear()
                etImagem.text.clear()
            }
        }

        tvVerLista.setOnClickListener {
            startActivity(Intent(this, ListaContatosActivity::class.java))
        }
    }
}
