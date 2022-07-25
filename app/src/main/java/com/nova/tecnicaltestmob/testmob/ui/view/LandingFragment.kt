package com.nova.tecnicaltestmob.testmob.ui.view

import android.os.Bundle
import android.os.Message
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.nova.tecnicaltestmob.databinding.FragmentLandingBinding
import com.nova.tecnicaltestmob.testmob.data.model.CatModel
import java.util.*
import kotlin.collections.ArrayList


class LandingFragment(private val datosCat: List<CatModel>? = emptyList()) : Fragment() {

    private lateinit var binding: FragmentLandingBinding
    private lateinit var adapter: CatAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLandingBinding.inflate(inflater, container, false)

        if (!datosCat.isNullOrEmpty()) {
            initRecyclerView()
        } else {
            Toast.makeText(
                context,
                "No se obtuvo respuesta por parte del servidor ",
                Toast.LENGTH_LONG
            ).show()
        }
        eventFilterCat()
        return binding.root
    }

    private fun initRecyclerView() {
        adapter = CatAdapter(datosCat!!, activity as AppCompatActivity)
        binding.recyclerCat.layoutManager = LinearLayoutManager(context)
        binding.recyclerCat.adapter = adapter
    }

    private fun eventFilterCat() {
        binding.search.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(msg: String): Boolean {
                filterCat(msg)
                return false
            }
        })
    }

    private fun filterCat(nameCat: String) {

        val listCat = mutableListOf<CatModel>()

        if (!datosCat.isNullOrEmpty()) {

            for (item in datosCat) {
                if (item.name.lowercase(Locale.getDefault())
                        .contains(nameCat.lowercase(Locale.getDefault()))) {
                    listCat.add(item)
                }
            }

            if(listCat.isEmpty() && !datosCat.isNullOrEmpty())
                initRecyclerView()
            else {
                adapter = CatAdapter(listCat, activity as AppCompatActivity)
                binding.recyclerCat.layoutManager = LinearLayoutManager(context)
                binding.recyclerCat.adapter = adapter
            }
        }
    }


}