package org.sopt.soptkathon_android_2.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.sopt.soptkathon_android_2.data.di.ServiceModule

class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    fun initScreen() {
        viewModelScope.launch {
            runCatching {
                ServiceModule.apiService.getHome()
            }.onSuccess {response ->
                val data = response.data ?: return@launch
                _uiState.update { state ->
                    state.copy(
                        missionCompletedCount = data.missionCompletedCount,
                        level = data.level,
                        movedDistance = data.movedDistance,
                        missions = data.missionCompleted,
                    )
                }
            }.onFailure {
                Log.e("home", it.toString())
            }
        }
    }
}
