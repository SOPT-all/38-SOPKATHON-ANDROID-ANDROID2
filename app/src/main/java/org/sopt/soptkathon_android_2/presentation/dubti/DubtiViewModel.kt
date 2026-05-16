package org.sopt.soptkathon_android_2.presentation.dubti

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DubtiViewModel  : ViewModel() {
    private val _uiState = MutableStateFlow(DubtiUiState())
    val uiState: StateFlow<DubtiUiState> = _uiState.asStateFlow()
}
