package com.example.app18_ViewModel.ui.screen.exemple1

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class Counter_amb_State_ViewModel : ViewModel() {

    var count by mutableStateOf(0)
        private set

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }
}
