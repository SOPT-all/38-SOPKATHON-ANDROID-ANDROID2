package org.sopt.soptkathon_android_2.core.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

object SoptkathonTheme {
    val colors: SoptkathonColor
        @Composable
        @ReadOnlyComposable
        get() = LocalSoptkathonColors.current

    val typography: SoptkathonTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalSoptkathonTypography.current
}

@Composable
fun SoptkathonTheme(
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalSoptkathonColors provides defaultSoptkathonColor,
        LocalSoptkathonTypography provides defaultSoptkathonTypography,
    ) {
        MaterialTheme(
            content = content,
        )
    }
}
