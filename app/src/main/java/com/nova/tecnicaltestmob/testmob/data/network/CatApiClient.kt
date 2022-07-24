package com.nova.tecnicaltestmob.testmob.data.network

import com.nova.tecnicaltestmob.testmob.data.model.CatModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface CatApiClient {

    @Headers("x-api-key: bda53789-d59e-46cd-9bc4-2936630fde39")
    @GET("breeds/")
    suspend fun getAllCat():Response<List<CatModel>>
}