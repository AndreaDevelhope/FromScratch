package com.example.fromscratch

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fromscratch.databinding.ItemBinding

class ListAdapter(private val items : List<ItemData>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun binding(item: ItemData) {
            binding.recycleImage.setImageResource(item.icon)
            binding.recycleText.setText(item.text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(items[position])
    }
}