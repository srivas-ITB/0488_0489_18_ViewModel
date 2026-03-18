package com.example.app18_ViewModel.ui.screen.exemple1

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class Counter_amb_StateFlow_ViewModel : ViewModel() {

        private val _count = MutableStateFlow(0)

        val count: StateFlow<Int> = _count.asStateFlow()

        fun increment() {
            _count.value++
        }

        fun decrement() {
            _count.value--
        }
    }
