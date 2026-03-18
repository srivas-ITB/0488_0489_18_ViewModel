package com.example.app18_ViewModel.ui.screen.exemple1


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Exemple1_amb_StateFlow(modifier: Modifier = Modifier,counterViewModel: Counter_amb_StateFlow_ViewModel = viewModel()) {
    val count by counterViewModel.count.collectAsStateWithLifecycle()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = "$count", fontSize = 24.sp)
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = modifier.fillMaxWidth()) {
            Button(onClick = { counterViewModel.decrement() }) { Text(text = "Decrementa") }
            Button(onClick = { counterViewModel.increment()}) { Text(text = "Incrementa") }
        }
    }
}
