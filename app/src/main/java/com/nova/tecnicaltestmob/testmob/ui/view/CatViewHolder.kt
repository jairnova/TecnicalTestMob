package com.nova.tecnicaltestmob.testmob.ui.view

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nova.tecnicaltestmob.R
import com.nova.tecnicaltestmob.databinding.ItemCatBinding
import com.nova.tecnicaltestmob.testmob.data.model.CatModel

class CatViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemCatBinding.bind(view)

    fun bind(item: CatModel, context: Context, activity: AppCompatActivity) {
        binding.txRace.text = item.name
        binding.txCountry.text = item.origin
        binding.txIntelligence.text = "Inteligencia: "+item.intelligence

        if(item.image != null){
            Glide.with(context).load(item.image.url).into(binding.imageSearch)
        }

        binding.txMas.setOnClickListener {
            activity.supportFragmentManager.beginTransaction()
                .add(R.id.activity_menu, DetailFragment(item)).commit()
        }
    }
}