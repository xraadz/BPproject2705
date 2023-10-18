package com.example.projectbp2705

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterResponsi(private val ListKunjung:List<KunjungMod>):
    RecyclerView.Adapter<AdapterResponsi.ViewHolder>(){

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.imageGamKun)
        val title:TextView = itemView.findViewById(R.id.textViewTitel)
        val desc:TextView = itemView.findViewById(R.id.textViewDeskrip)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterResponsi.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_responsi,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterResponsi.ViewHolder, position: Int) {
        val yangKunjung = ListKunjung[position]

        holder.image.setImageResource(yangKunjung.image)
        holder.title.text = yangKunjung.title
        holder.desc.text = yangKunjung.desc
    }

    override fun getItemCount(): Int {
        return ListKunjung.size
    }

}