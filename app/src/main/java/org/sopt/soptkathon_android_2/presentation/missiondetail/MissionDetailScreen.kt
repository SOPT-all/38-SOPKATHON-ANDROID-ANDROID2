package org.sopt.soptkathon_android_2.presentation.missiondetail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MissionDetailRoute(
    modifier: Modifier = Modifier,
    viewModel: MissionDetailViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    MissionDetailScreen(
        uiState = uiState,
        modifier = modifier,
    )
}

@Composable
private fun MissionDetailScreen(
    uiState: MissionDetailUiState,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "MissionDetail")
    }
}