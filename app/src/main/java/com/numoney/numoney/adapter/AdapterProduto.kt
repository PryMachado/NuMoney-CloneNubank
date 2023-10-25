package com.numoney.numoney.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.numoney.numoney.databinding.ProdutoItemBinding
import com.numoney.numoney.model.Produto

class AdapterProduto (private  val context: Context, private val ListaProdutos:MutableList<Produto>):
    RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
      val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ProdutoViewHolder(itemLista)
    }


    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.txtTextoInformativo.text= ListaProdutos[position].texto
    }

    override fun getItemCount() = ListaProdutos.size


    inner class ProdutoViewHolder(binding:ProdutoItemBinding): RecyclerView.ViewHolder(binding.root) {
  val  txtTextoInformativo=binding.txtTextoInformativo
    }
}