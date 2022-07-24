package com.nova.tecnicaltestmob.testmob.domain

import com.nova.tecnicaltestmob.testmob.data.model.CatModel
import com.nova.tecnicaltestmob.testmob.data.repository.CatRepository

class GetListCatUseCase {

    private val repository = CatRepository()

    suspend operator fun invoke() : List<CatModel>? = repository.getAllCat()
}