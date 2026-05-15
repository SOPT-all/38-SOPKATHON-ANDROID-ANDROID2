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
    val dummy: Color,
)

val defaultSoptkathonColor = SoptkathonColor(
    dummy = Color(0xFF000000),
)

val LocalSoptkathonColors = staticCompositionLocalOf { defaultSoptkathonColor }

@Preview
@Composable
private fun SoptkathonColorPreview() {
    val colors = listOf(
        defaultSoptkathonColor.dummy,
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
