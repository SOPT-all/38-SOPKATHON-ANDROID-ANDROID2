package org.sopt.soptkathon_android_2.presentation.doyeon

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DoyeonViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(DoyeonUiState())
    val uiState: StateFlow<DoyeonUiState> = _uiState.asStateFlow()
}
