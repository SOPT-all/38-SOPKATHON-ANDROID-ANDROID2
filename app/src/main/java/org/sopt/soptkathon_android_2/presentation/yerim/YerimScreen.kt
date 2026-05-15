package org.sopt.soptkathon_android_2.presentation.yerim

import androidx.compose.foundation.clickable
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
fun YerimRoute(
    navigateToDoyeon: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: YerimViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    YerimScreen(
        uiState = uiState,
        navigateToDoyeon = navigateToDoyeon,
        modifier = modifier,
    )
}

@Composable
private fun YerimScreen(
    uiState: YerimUiState,
    navigateToDoyeon: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Yerim",
            modifier = Modifier.clickable { navigateToDoyeon() }
        )
    }
}