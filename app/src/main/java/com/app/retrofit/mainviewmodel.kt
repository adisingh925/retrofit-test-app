package com.app.retrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class mainviewmodel(private val repository: repository) :ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return mainviewmodel(repository) as T
    }
}