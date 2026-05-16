package org.sopt.soptkathon_android_2.presentation.mission

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.sopt.soptkathon_android_2.presentation.main.bottombar.MainBottomBar
import org.sopt.soptkathon_android_2.presentation.main.bottombar.MainTab

@Composable
fun MissionRoute(
    navigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: MissionViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    MissionScreen(
        uiState = uiState,
        navigateToHome = navigateToHome,
        modifier = modifier,
    )
}

@Composable
private fun MissionScreen(
    uiState: MissionUiState,
    navigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            MainBottomBar(
                currentTab = MainTab.MISSION,
                onClick = navigateToHome,
            )
        }
    ) {innerPadding ->
        Column(
            modifier = modifier.padding(innerPadding)
        ) {

            Text(
                "미션"
            )
        }
    }
}