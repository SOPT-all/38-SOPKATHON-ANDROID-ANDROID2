package org.sopt.soptkathon_android_2.core.designsystem.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Immutable
data class SoptkathonColor(
    val gray00: Color,
    val gray50: Color,
    val gray100: Color,
    val gray200: Color,
    val gray300: Color,
    val gray400: Color,
    val gray500: Color,
    val gray1000: Color,

    val yellow500: Color,
)

val defaultSoptkathonColor = SoptkathonColor(
    gray00 = Color(0xFFFFFFFF),
    gray50 = Color(0xFFEBEBEB),
    gray100 = Color(0xFFBABABA),
    gray200 = Color(0xFF6A6B6A),
    gray300 = Color(0xFF4D4E4D),
    gray400 = Color(0xFF212220),
    gray500 = Color(0xFF121312),
    gray1000 = Color(0xFF000000),

    yellow500 = Color(0xFFFAEE7F),
    )

val LocalSoptkathonColors = staticCompositionLocalOf { defaultSoptkathonColor }

@Preview
@Composable
private fun SoptkathonColorPreview() {
    val colors = listOf(
        defaultSoptkathonColor.gray00,
        defaultSoptkathonColor.gray50,
        defaultSoptkathonColor.gray100,
        defaultSoptkathonColor.gray200,
        defaultSoptkathonColor.gray300,
        defaultSoptkathonColor.gray400,
        defaultSoptkathonColor.gray500,
        defaultSoptkathonColor.gray1000,

        defaultSoptkathonColor.yellow500,
    )

    FlowRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(all = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        maxItemsInEachRow = 8,
    ) {
        colors.forEach { color ->
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(color)
            )
        }
    }
}
