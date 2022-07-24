package com.nova.tecnicaltestmob.testmob.data.repository

import com.nova.tecnicaltestmob.testmob.data.model.CatModel
import com.nova.tecnicaltestmob.testmob.data.model.CatProvider
import com.nova.tecnicaltestmob.testmob.data.network.CatService

class CatRepository {

    private val api = CatService()

    suspend fun getAllCat () : List<CatModel> {
        val response = api.getCat()
        CatProvider.cat = response
        return response
    }
}