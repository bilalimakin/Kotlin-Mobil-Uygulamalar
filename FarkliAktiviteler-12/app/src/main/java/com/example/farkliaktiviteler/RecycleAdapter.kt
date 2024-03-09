package com.example.farkliaktiviteler

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter(val konuListesi : ArrayList<String>, val konuResimleri : ArrayList<Bitmap>) : RecyclerView.Adapter<RecycleAdapter.tarihSorulariVH>(){

    class tarihSorulariVH(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val recyclerViewTextView: TextView = itemView.findViewById(R.id.recyclerViewTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tarihSorulariVH {
        //bağlamaları bu alanda yapıyoruz -> Inflater, LayoutInflater, MenuInflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return tarihSorulariVH(itemView)
    }

    override fun getItemCount(): Int {
        return konuListesi.size //içerisinde kaçtane eleman old. öğreniyoruz
    }

    override fun onBindViewHolder(holder: tarihSorulariVH, position: Int) {
        holder.recyclerViewTextView.text = konuListesi.get(position)
    }
}