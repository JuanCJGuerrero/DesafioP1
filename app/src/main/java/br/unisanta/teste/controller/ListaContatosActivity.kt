package br.unisanta.teste.controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.teste.R
import br.unisanta.teste.view.ContatoAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaContatosActivity : AppCompatActivity() { 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_contatos)

        val recyclerView = findViewById<RecyclerView>(R.id.rvContatos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContatoAdapter(MainActivity.listaContatos)

        val fabVoltar = findViewById<FloatingActionButton>(R.id.fabVoltar)
        fabVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }
    }
}