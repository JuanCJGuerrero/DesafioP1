/*package br.unisanta.teste.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.teste.R
import br.unisanta.teste.model.Usuario
import br.unisanta.ui.R
import br.unisanta.ui.controller.model.Usuario

class UsuarioAdapter(
    private val usuarios: MutableList<Usuario>
) : RecyclerView.Adapter<>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_usuario, parent, false)

        return UsuarioViewHolder(view)
    }

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        val usuario = usuarios[position]

        holder.txvEmail.text = usuario.email
    }

    override fun getItemCount(): Int {
        return usuarios.size
    }
}*/