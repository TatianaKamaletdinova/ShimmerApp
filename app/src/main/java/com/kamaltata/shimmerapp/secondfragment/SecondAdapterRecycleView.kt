package com.kamaltata.shimmerapp.secondfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kamaltata.shimmerapp.R

class SecondAdapterRecycleView(private val data: List<Pair<String, String>>) : RecyclerView.Adapter<SecondAdapterRecycleView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_second_fragment, parent, false))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.tv_title.text = item.first
        holder.tv_body.text = item.second
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tv_title: TextView = view.findViewById(R.id.tv_title)
        val tv_body: TextView = view.findViewById(R.id.tv_body)
    }
}