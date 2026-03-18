package com.example.app18_ViewModel.ui.screen.pokemon.v1_key

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Pokemon
import com.example.myapplication.domain.PokemonProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailViewModel(pokemonId: Int) : ViewModel() {
    private val provider = PokemonProvider()

    private val _pokemon = MutableStateFlow<Pokemon?>(null)
    val pokemon: StateFlow<Pokemon?> = _pokemon.asStateFlow()

    init {
        _pokemon.value = provider.getPokemon(pokemonId)
    }

    /*fun loadPokemon(id: Int) {
        _pokemon.value = provider.getPokemon(id)
    }*/
}