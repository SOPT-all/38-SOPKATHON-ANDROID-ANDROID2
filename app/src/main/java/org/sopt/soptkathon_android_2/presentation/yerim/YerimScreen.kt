package org.sopt.soptkathon_android_2.presentation.yerim

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun YerimRoute(
    modifier: Modifier = Modifier,
    viewModel: YerimViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    YerimScreen(
        uiState = uiState,
        modifier = modifier,
    )
}

@Composable
private fun YerimScreen(
    uiState: YerimUiState,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "Yerim",
        )
    }
}