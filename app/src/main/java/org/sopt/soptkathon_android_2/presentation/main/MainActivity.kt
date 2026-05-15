package org.sopt.soptkathon_android_2.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.presentation.main.navigation.rememberSoptkathonNavigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navigator = rememberSoptkathonNavigator()

            SoptkathonTheme {
                MainScreen(
                    navigator = navigator,
                )
            }
        }
    }
}
