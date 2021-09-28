package com.example.recyclerviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*
import java.util.ArrayList

class RecyclerViewAdapter (val text: Context , val masseg: ArrayList<String>):
    RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>(){
    class ItemViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(text).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ItemViewHolder, position: Int) {
        val message = masseg[position]
        holder.itemView.apply {

            tvMessage.text = message
        }
    }

    override fun getItemCount() = masseg.size


}


