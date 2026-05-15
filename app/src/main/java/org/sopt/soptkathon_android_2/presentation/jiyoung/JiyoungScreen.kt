package org.sopt.soptkathon_android_2.presentation.jiyoung

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun JiyoungRoute(
    modifier: Modifier = Modifier,
    viewModel: JiyoungViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    JiyoungScreen(
        uiState = uiState,
        modifier = modifier,
    )
}

@Composable
private fun JiyoungScreen(
    uiState: JiyoungUiState,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = "Jiyoung",
        )
    }
}