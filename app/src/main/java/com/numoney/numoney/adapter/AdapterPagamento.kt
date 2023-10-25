package com.numoney.numoney.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.numoney.numoney.databinding.PagamentoItemBinding
import com.numoney.numoney.model.Pagamento

class AdapterPagamento (private val contex:Context, private val ListaPagamento: MutableList<Pagamento>):
    RecyclerView.Adapter<AdapterPagamento.PagamentoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagamentoViewHolder {
        val itemLista = PagamentoItemBinding.inflate(LayoutInflater.from(contex),parent, false)
        return PagamentoViewHolder(itemLista)
    }


    override fun onBindViewHolder(holder: PagamentoViewHolder, position: Int) {
       holder.iconePagamento.setImageResource(ListaPagamento[position].icone!!)
        holder.txtTitloPagamento.text = ListaPagamento[position].titlo
    }

    override fun getItemCount() = ListaPagamento.size




    inner class PagamentoViewHolder(binding: PagamentoItemBinding): RecyclerView.ViewHolder(binding.root) {
     val iconePagamento = binding.icPagamento
        val txtTitloPagamento = binding.txtTituloPagamento
    }

}