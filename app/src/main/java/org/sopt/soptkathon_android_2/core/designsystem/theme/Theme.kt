package org.sopt.soptkathon_android_2.core.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

private val SoptkathonColorScheme = lightColorScheme(
    primary = defaultSoptkathonColor.yellow500,
    background = defaultSoptkathonColor.gray00,
)

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
            colorScheme = SoptkathonColorScheme,
            content = content,
        )
    }
}
