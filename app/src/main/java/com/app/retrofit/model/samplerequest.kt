package com.app.retrofit.model

import retrofit2.http.GET

interface samplerequest {

    @GET("posts/1")
    suspend fun getdata():data
}