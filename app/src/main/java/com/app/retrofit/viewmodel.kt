package com.app.retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.retrofit.model.data
import kotlinx.coroutines.launch

class viewmodel(private val repository: repository) :ViewModel(){

    val myresponse:MutableLiveData<data> = MutableLiveData()

    fun getpost()
    {
        viewModelScope.launch {
            val response = repository.getpost()
            myresponse.value = response
        }
    }

}