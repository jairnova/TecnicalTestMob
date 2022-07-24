package com.nova.tecnicaltestmob.testmob.ui.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nova.tecnicaltestmob.R
import com.nova.tecnicaltestmob.testmob.data.model.CatModel

class CatAdapter(val datosCat: List<CatModel>) : RecyclerView.Adapter<CatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CatViewHolder(layoutInflater.inflate(R.layout.item_cat, parent, false))
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val item = datosCat[position]
        holder.bind(item.name, item.origin, item.intelligence)
    }

    override fun getItemCount(): Int = datosCat.size

}