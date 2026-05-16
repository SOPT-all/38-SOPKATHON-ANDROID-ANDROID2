package org.sopt.soptkathon_android_2.presentation.home

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
import coil3.size.Scale
import org.sopt.soptkathon_android_2.presentation.main.bottombar.MainBottomBar
import org.sopt.soptkathon_android_2.presentation.main.bottombar.MainTab

@Composable
fun HomeRoute(
    navigateToMission: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    HomeScreen(
        uiState = uiState,
        navigateToMission = navigateToMission,
        modifier = modifier,
    )
}

@Composable
private fun HomeScreen(
    uiState: HomeUiState,
    navigateToMission: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            MainBottomBar(
                currentTab = MainTab.HOME,
                onClick = navigateToMission,
            )
        }
    ) {innerPadding ->
        Column(
            modifier = modifier.padding(innerPadding)
        ) {
            Text("홈")
        }
    }
}