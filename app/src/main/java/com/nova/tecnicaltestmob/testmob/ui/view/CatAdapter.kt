package com.nova.tecnicaltestmob.testmob.ui.view

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.nova.tecnicaltestmob.R
import com.nova.tecnicaltestmob.testmob.data.model.CatModel

class CatAdapter(val datosCat: List<CatModel>,val activity: AppCompatActivity) : RecyclerView.Adapter<CatViewHolder>() {

    private lateinit var context : Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        context = parent.context
        val layoutInflater = LayoutInflater.from(parent.context)
        return CatViewHolder(layoutInflater.inflate(R.layout.item_cat, parent, false))
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val item = datosCat[position]
        holder.bind(item, context,activity)
    }

    override fun getItemCount(): Int = datosCat.size

}