package org.sopt.soptkathon_android_2.presentation.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.sopt.soptkathon_android_2.presentation.main.navigation.MainNavHost
import org.sopt.soptkathon_android_2.presentation.main.navigation.MainNavigator

@Composable
fun MainScreen(
    navigator: MainNavigator,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
    ) { innerPadding ->
        MainNavHost(
            navigator = navigator,
            paddingValues = innerPadding,
        )
    }
}
