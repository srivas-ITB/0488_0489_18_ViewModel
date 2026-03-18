package com.example.app18_ViewModel.ui.screen.pokemon.v2_senseFactory

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun DetailScreen(id: Int, navigateBack: () -> Unit){
    val viewModel: DetailViewModel = viewModel(
        factory = DetailViewModelFactory(id))

    LaunchedEffect(id) {
        viewModel.loadPokemon(id)
    }


    val pokemon = viewModel.pokemon.collectAsState()
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = pokemon.value?.name ?: "Unknown")
        Button(onClick = navigateBack) {
            Text("Return to list")
        }
    }
}