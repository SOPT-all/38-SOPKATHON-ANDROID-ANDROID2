package org.sopt.soptkathon_android_2.presentation.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigateToOnboarding: () -> Unit,
    modifier: Modifier = Modifier,
) {
    LaunchedEffect(Unit) {
        delay(2000)
        navigateToOnboarding()
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFBF199)),
        contentAlignment = Alignment.Center,
    ){}
}
