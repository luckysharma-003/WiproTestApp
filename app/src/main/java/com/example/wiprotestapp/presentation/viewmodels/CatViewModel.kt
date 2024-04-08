package com.example.wiprotestapp.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wiprotestapp.domain.entities.CatImage
import com.example.wiprotestapp.domain.usecases.GetCatImagesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.Collections.emptyList
import javax.inject.Inject

@HiltViewModel
class CatViewModel @Inject constructor(
    private val getCatImagesUseCase: GetCatImagesUseCase
) : ViewModel() {

    private val _imageState = MutableStateFlow<List<CatImage>>(emptyList())
    val imageState: StateFlow<List<CatImage>> = _imageState

    init {
        fetchCatImages()
    }

    private fun fetchCatImages() {
        viewModelScope.launch {
            _imageState.value = getCatImagesUseCase()
        }
    }
}