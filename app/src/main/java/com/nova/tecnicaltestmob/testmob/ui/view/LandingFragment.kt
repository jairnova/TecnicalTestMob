package com.nova.tecnicaltestmob.testmob.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.nova.tecnicaltestmob.databinding.FragmentLandingBinding
import com.nova.tecnicaltestmob.testmob.data.model.CatModel


class LandingFragment(private val datosCat : List<CatModel>? = emptyList()) : Fragment() {

    private lateinit var binding: FragmentLandingBinding
    private lateinit var adapter: CatAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLandingBinding.inflate(inflater, container, false)

        if(!datosCat.isNullOrEmpty()){
            initRecyclerView()
        } else {
            Toast.makeText(context, "No se obtuvo respuesta por parte del servidor ", Toast.LENGTH_LONG).show()
        }
        return binding.root
    }

    private fun initRecyclerView() {
        adapter = CatAdapter(datosCat!!)
        binding.recyclerCat.layoutManager = LinearLayoutManager(context)
        binding.recyclerCat.adapter = adapter
    }

}