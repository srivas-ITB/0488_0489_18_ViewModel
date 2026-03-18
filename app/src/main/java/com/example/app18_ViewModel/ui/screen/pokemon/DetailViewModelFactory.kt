package com.example.app18_ViewModel.ui.screen.pokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DetailViewModelFactory (private val pokemonId: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
