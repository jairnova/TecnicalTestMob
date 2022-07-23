package com.nova.tecnicaltestmob.testmob.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RertrofitHelper {

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.thecatapi.com/v1/breeds")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}