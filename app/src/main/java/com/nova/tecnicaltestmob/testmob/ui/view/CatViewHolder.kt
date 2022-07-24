package com.nova.tecnicaltestmob.testmob.ui.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.nova.tecnicaltestmob.databinding.ItemCatBinding

class CatViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemCatBinding.bind(view)

    fun bind(race: String, country: String, intelligence: String ) {
        binding.txRace.text = race
        binding.txCountry.text = country
        binding.txIntelligence.text = intelligence
    }
}