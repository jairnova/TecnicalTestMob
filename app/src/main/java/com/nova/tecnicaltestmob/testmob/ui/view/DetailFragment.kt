package com.nova.tecnicaltestmob.testmob.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nova.tecnicaltestmob.R
import com.nova.tecnicaltestmob.databinding.FragmentDetailBinding
import com.nova.tecnicaltestmob.databinding.FragmentLandingBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }


}