package org.sopt.soptkathon_android_2.presentation.doyeon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun DoyeonRoute(
    modifier: Modifier = Modifier,
    viewModel: DoyeonViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    DoyeonScreen(
        uiState = uiState,
        modifier = modifier,
    )
}

@Composable
private fun DoyeonScreen(
    uiState: DoyeonUiState,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "Doyeon",
        )
    }
}
