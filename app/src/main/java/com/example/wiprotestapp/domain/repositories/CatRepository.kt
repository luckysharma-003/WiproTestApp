package com.example.wiprotestapp.domain.repositories

import com.example.wiprotestapp.domain.entities.CatImage

interface CatRepository {
    suspend fun getCatImages(): List<CatImage>
}