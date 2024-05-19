package com.example.trojmiastoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AttractionAdapter(private val attractions: List<Attraction>) : RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttractionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_attraction, parent, false)
        return AttractionViewHolder(view)
    }

    override fun onBindViewHolder(holder: AttractionViewHolder, position: Int) {
        val attraction = attractions[position]
        holder.image.setImageResource(attraction.imageResId)
        holder.title.text = attraction.title
        holder.description.text = attraction.description
    }

    override fun getItemCount() = attractions.size

    class AttractionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val title: TextView = itemView.findViewById(R.id.title)
        val description: TextView = itemView.findViewById(R.id.description)
    }
}
