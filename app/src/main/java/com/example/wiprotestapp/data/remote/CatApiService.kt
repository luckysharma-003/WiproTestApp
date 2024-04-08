package com.example.wiprotestapp.data.remote

import com.example.wiprotestapp.domain.entities.CatImage
import retrofit2.http.GET

interface CatApiService {

    @GET("v1/images/search?limit=10")
    suspend fun getCatImages(): List<CatImage>
}