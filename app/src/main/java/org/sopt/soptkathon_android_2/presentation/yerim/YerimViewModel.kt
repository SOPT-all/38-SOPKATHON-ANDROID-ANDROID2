package org.sopt.soptkathon_android_2.presentation.yerim

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class YerimViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(YerimUiState())
    val uiState: StateFlow<YerimUiState> = _uiState.asStateFlow()
}