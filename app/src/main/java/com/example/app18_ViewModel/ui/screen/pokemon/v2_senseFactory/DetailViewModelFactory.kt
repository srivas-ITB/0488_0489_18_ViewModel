package com.example.app18_ViewModel.ui.screen.pokemon.v2_senseFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.app18_ViewModel.ui.screen.pokemon.DetailViewModel

class DetailViewModelFactory (private val pokemonId: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
