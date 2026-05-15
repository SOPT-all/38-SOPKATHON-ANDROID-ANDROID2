package org.sopt.soptkathon_android_2.presentation.doyeon

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
fun DoyeonRoute(
    navigateToJiyoung: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: DoyeonViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    DoyeonScreen(
        uiState = uiState,
        navigateToJiyoung = navigateToJiyoung,
        modifier = modifier,
    )
}

@Composable
private fun DoyeonScreen(
    uiState: DoyeonUiState,
    navigateToJiyoung: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Doyeon",
            modifier = Modifier.clickable { navigateToJiyoung() }
        )
    }
}
