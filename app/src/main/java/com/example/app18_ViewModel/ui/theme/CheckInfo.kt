package com.example.app18_ViewModel.ui.theme

data class CheckInfo(
    val title: String,
    var checked: Boolean = false,
    var onCheckedChange: (Boolean) -> Unit
)
