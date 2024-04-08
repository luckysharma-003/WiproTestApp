package com.example.wiprotestapp.data.repositories

import com.example.wiprotestapp.data.remote.CatApiService
import com.example.wiprotestapp.domain.entities.CatImage
import com.example.wiprotestapp.domain.repositories.CatRepository

class CatRepositoryImpl(private val apiService: CatApiService) : CatRepository {
    override suspend fun getCatImages(): List<CatImage> = apiService.getCatImages()
}