package org.sopt.soptkathon_android_2.presentation.jiyoung

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
fun JiyoungRoute(
    navigateToYerim: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: JiyoungViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    JiyoungScreen(
        uiState = uiState,
        navigateToYerim = navigateToYerim,
        modifier = modifier,
    )
}

@Composable
private fun JiyoungScreen(
    uiState: JiyoungUiState,
    navigateToYerim: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Jiyoung",
            modifier = Modifier.clickable { navigateToYerim() }
        )
    }
}