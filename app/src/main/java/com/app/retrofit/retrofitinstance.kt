package com.app.retrofit

import com.app.retrofit.model.samplerequest
import com.app.retrofit.util.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object retrofitinstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    val api : samplerequest by lazy {
        retrofit.create(samplerequest::class.java)
    }

}