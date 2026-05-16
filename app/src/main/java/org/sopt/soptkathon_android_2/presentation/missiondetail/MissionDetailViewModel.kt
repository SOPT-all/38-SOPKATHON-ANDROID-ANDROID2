package org.sopt.soptkathon_android_2.presentation.missiondetail

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MissionDetailViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MissionDetailUiState())
    val uiState: StateFlow<MissionDetailUiState> = _uiState.asStateFlow()

    fun onStart() {
        _uiState.update { it.copy(step = it.step + 1) }
    }

    fun onComplete() {
        // TODO : API
    }
}