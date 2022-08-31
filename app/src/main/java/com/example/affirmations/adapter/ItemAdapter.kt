package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
import com.example.affirmations.model.Anime

class ItemAdapter(private val context: Context, private var animes : List<Anime> ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val imageURL = animes.get(position).imageURL
        val imageView = holder.imageView
        holder.textView.text = animes.get(position).name
        Glide.with(context)
            .load(imageURL)
            .into(imageView)
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, (position+1).toString(), Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount() : Int {
        return animes.size
    }
}