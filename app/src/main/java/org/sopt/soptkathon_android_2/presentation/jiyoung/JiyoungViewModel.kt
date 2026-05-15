package org.sopt.soptkathon_android_2.presentation.jiyoung

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class JiyoungViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(JiyoungUiState())
    val uiState: StateFlow<JiyoungUiState> = _uiState.asStateFlow()
}