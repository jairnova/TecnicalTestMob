package com.nova.tecnicaltestmob.testmob.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nova.tecnicaltestmob.testmob.data.model.CatModel
import com.nova.tecnicaltestmob.testmob.domain.GetListCatUseCase
import kotlinx.coroutines.launch

class CatViewModel : ViewModel () {

    val catModel = MutableLiveData<List<CatModel>?>()
    var getListCatUseCase = GetListCatUseCase()

    fun onCreate() {
        viewModelScope.launch {
            val result = getListCatUseCase()
            catModel.postValue(result)
        }
    }
}