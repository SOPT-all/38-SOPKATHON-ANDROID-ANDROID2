package org.sopt.soptkathon_android_2.core.designsystem.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

object SoptkathonFont {

}

private fun soptkathonTextStyle(
    fontFamily: FontFamily,
    weight: FontWeight,
    size: TextUnit,
    lineHeight: TextUnit,
    letterSpacing: TextUnit,
) = TextStyle(
    fontFamily = fontFamily,
    fontWeight = weight,
    fontSize = size,
    lineHeight = lineHeight,
    letterSpacing = letterSpacing,
    platformStyle = PlatformTextStyle(
        includeFontPadding = false,
    ),
    lineHeightStyle = LineHeightStyle(
        alignment = LineHeightStyle.Alignment.Center,
        trim = LineHeightStyle.Trim.None,
    ),
)

@Immutable
data class SoptkathonTypography(
    val dummy: TextStyle,
)

val defaultSoptkathonTypography = SoptkathonTypography(
    dummy = soptkathonTextStyle(
        fontFamily = FontFamily.Default,
        weight = FontWeight.Normal,
        size = 14.sp,
        lineHeight = 1.2.em,
        letterSpacing = (-0.02).em,
    )
)

val LocalSoptkathonTypography = staticCompositionLocalOf { defaultSoptkathonTypography }

@Preview
@Composable
private fun SoptkathonTypographyPreview() {
    val typography = listOf(
        defaultSoptkathonTypography.dummy,
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(all = 20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        typography.forEach { typo ->
            Text(
                text = "가나다라ABCD",
                style = typo,
            )
        }
    }
}
