package com.example.wiprotestapp.domain.usecases

import com.example.wiprotestapp.domain.repositories.CatRepository

class GetCatImagesUseCase(private val repository: CatRepository) {
    suspend operator fun invoke() = repository.getCatImages()
}