package com.example.app18_ViewModel.ui.screen.pokemon.v0_inicial

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.app18_ViewModel.ui.screen.pokemon.v1_key.DetailViewModel

class DetailViewModelFactory (private val pokemonId: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(pokemonId) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
