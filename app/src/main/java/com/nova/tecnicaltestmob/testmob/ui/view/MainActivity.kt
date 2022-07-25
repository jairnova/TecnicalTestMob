package com.nova.tecnicaltestmob.testmob.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.nova.tecnicaltestmob.R
import com.nova.tecnicaltestmob.testmob.ui.viewmodel.CatViewModel

class MainActivity : AppCompatActivity() {

    private val catViewModel : CatViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getListCat()
    }

    private fun getListCat(){
        catViewModel.onCreate()

        catViewModel.catModel.observe(this, Observer { currentCat ->
            supportFragmentManager.beginTransaction()
                .add(R.id.activity_menu, LandingFragment(currentCat)).commit()
        })
    }
}