package com.nova.tecnicaltestmob.testmob.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.nova.tecnicaltestmob.R
import com.nova.tecnicaltestmob.databinding.FragmentDetailBinding
import com.nova.tecnicaltestmob.testmob.data.model.CatModel

class DetailFragment(private val item: CatModel) : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapearElementos()
    }

    private fun mapearElementos(){

        binding.title.text = item.name
        binding.txDescripcion.text = "Descripción: "+item.description
        binding.txRaza.text = "Raza: "+item.name
        binding.txPais.text = "Pais: "+item.origin
        binding.txInteligencia.text = "Inteligencia: "+item.intelligence
        binding.txAdaptabilidad.text = "Adaptabilidad: "+item.adaptability
        binding.txTiempoVida.text = "Tiempo de vida: "+item.life_span

        if(item.image != null){
            Glide.with(requireContext()).load(item.image.url).into(binding.imageSearch)
        }

        binding.btAtras.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.remove(this)?.commit()
        }
    }

}