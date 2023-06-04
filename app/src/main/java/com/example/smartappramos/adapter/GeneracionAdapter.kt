package com.example.smartappramos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.smartappramos.R
import com.example.smartappramos.model.GeneracionModel

class GeneracionAdapter(var lstGeneracion: List<GeneracionModel>): RecyclerView.Adapter<GeneracionAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ivPhoto: ImageView = itemView.findViewById(R.id.ivPhoto)
        val tvName: TextView = itemView.findViewById(R.id.tvNombre)
        val tvFecha: TextView = itemView.findViewById(R.id.tvFecha)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.layout_generacion,parent,false))
    }

    override fun getItemCount(): Int {
        return lstGeneracion.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstGeneracion[position]
        holder.ivPhoto.setImageResource(itemSong.photo)
        holder.tvName.text = itemSong.name
        holder.tvFecha.text = itemSong.fecha
    }
}