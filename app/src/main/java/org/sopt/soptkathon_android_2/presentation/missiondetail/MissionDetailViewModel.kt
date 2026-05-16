package org.sopt.soptkathon_android_2.presentation.missiondetail

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.sopt.soptkathon_android_2.data.di.ServiceModule

class MissionDetailViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MissionDetailUiState())
    val uiState: StateFlow<MissionDetailUiState> = _uiState.asStateFlow()

    fun onStart() {
        _uiState.update { it.copy(step = it.step + 1) }
    }

    fun onComplete() {
        viewModelScope.launch {
            runCatching {
                ServiceModule.apiService.postMission(1)
            }
                .onSuccess {
                    Log.d("onComplete", "미션 성공")
                }
                .onFailure {
                    Log.e("onComplete", "미션 실패: $it")
                }
        }
    }
}