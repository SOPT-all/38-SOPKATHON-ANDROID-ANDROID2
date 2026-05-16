package org.sopt.soptkathon_android_2.presentation.dubti

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
fun DubtiRoute(
    navigateToDoyeon: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: DubtiViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    DubtiScreen(
        uiState = uiState,
        navigateToJiyoung = navigateToDoyeon,
        modifier = modifier,
    )
}

@Composable
private fun DubtiScreen(
    uiState: DubtiUiState,
    navigateToJiyoung: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "dubi",
            modifier = Modifier.clickable { navigateToJiyoung() }
        )
    }
}
