package com.app.retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewmodel: viewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = repository()

        val viewmodelfactory = mainviewmodel(repository)

        viewmodel = ViewModelProvider(this,viewmodelfactory)[viewmodel::class.java]
        viewmodel.getpost()

        viewmodel.myresponse.observe(this, { response ->

            Log.d("response",response.userId.toString())
            Log.d("response",response.id.toString())
            Log.d("response", response.title)
            Log.d("response", response.body)

        })

    }
}