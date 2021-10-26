package com.app.retrofit

import com.app.retrofit.model.data

class repository {

    suspend fun getpost(): data {
        return retrofitinstance.api.getdata()
    }

}