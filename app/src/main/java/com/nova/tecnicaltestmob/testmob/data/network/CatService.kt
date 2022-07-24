package com.nova.tecnicaltestmob.testmob.data.network

import com.nova.tecnicaltestmob.testmob.core.RetrofitHelper
import com.nova.tecnicaltestmob.testmob.data.model.CatModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CatService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getCat() : List<CatModel>{
        return withContext(Dispatchers.IO){
            val response  = retrofit.create(CatApiClient::class.java).getAllCat()
            response.body() ?: emptyList()
        }
    }

}