package br.unisanta.teste.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.teste.R
import br.unisanta.teste.model.Contato
import com.bumptech.glide.Glide

class ContatoAdapter(private val lista: MutableList<Contato>) :
    RecyclerView.Adapter<ContatoAdapter.ContatoViewHolder>() {

    class ContatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgContato: ImageView = itemView.findViewById(R.id.imgContato)
        val tvNome: TextView = itemView.findViewById(R.id.tvNome)
        val tvTelefone: TextView = itemView.findViewById(R.id.tvTelefone)
        val btn1: Button = itemView.findViewById(R.id.btn1)
        val btn2: Button = itemView.findViewById(R.id.btn2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contato, parent, false)
        return ContatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        val contato = lista[position]

        holder.tvNome.text = contato.nome
        holder.tvTelefone.text = contato.telefone
        holder.btn2.text = "Excluir"

        Glide.with(holder.itemView.context)
            .load(contato.imagemUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_foreground)
            .into(holder.imgContato)

        holder.btn2.setOnClickListener {
            if (lista.isNotEmpty()) {
                lista.removeAt(position)  
                notifyItemRemoved(position)
            }
        }
    }


    override fun getItemCount() = lista.size
}