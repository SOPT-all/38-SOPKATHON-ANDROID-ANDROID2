package org.sopt.soptkathon_android_2.presentation.dubti

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class DubtiViewModel  : ViewModel() {
    private val _uiState = MutableStateFlow(DubtiUiState())
    val uiState: StateFlow<DubtiUiState> = _uiState.asStateFlow()

    private val _uiEffect = MutableSharedFlow<DubtiUiEffect>()
    val uiEffect = _uiEffect.asSharedFlow()


    fun onAnswer1Click(answer: String) {
        _uiState.update { it.copy(pageCount = 2, answer1 = answer) }
    }

    fun onAnswer2Click(answer: String) {
        _uiState.update { it.copy(pageCount = 3, answer2 = answer) }
    }

    fun onAnswer3Click(answer: String) {
        _uiState.update { it.copy(answer3 = answer, isLoading = true) }

        viewModelScope.launch {
            delay(3000)
            _uiEffect.emit(DubtiUiEffect.NavigateToDoyeon)
        }
    }
}
