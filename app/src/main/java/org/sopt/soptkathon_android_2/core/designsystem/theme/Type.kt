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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import org.sopt.soptkathon_android_2.R

object SoptkathonFont {
    val bold = FontFamily(Font(R.font.pretendard_bold))
    val medium = FontFamily(Font(R.font.pretendard_medium))
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
    val h1_medium: TextStyle,
    val h1_bold: TextStyle,

    val t1_bold: TextStyle,
    val t2_bold: TextStyle,
    val t2_medium: TextStyle,

    val b1_bold: TextStyle,
    val b1_medium: TextStyle,
    val b2_bold: TextStyle,
    val b2_medium: TextStyle,
    val c1_bold: TextStyle,
    val c1_medium: TextStyle,
)

val defaultSoptkathonTypography = SoptkathonTypography(
    h1_medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 48.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    h1_bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 26.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
    t1_bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 22.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
    t2_bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 18.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
    t2_medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 18.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
    b1_bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 16.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
    b1_medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 16.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
    b2_bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 14.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
    b2_medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 14.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
    c1_bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 12.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
    c1_medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 12.sp,
        lineHeight = 1.4.em,
        letterSpacing = (-0.02).em,
    ),
)

val LocalSoptkathonTypography = staticCompositionLocalOf { defaultSoptkathonTypography }

@Preview
@Composable
private fun SoptkathonTypographyPreview() {
    val typography = listOf(
        defaultSoptkathonTypography.h1_medium,
        defaultSoptkathonTypography.h1_bold,
        defaultSoptkathonTypography.t1_bold,
        defaultSoptkathonTypography.t2_bold,
        defaultSoptkathonTypography.t2_medium,
        defaultSoptkathonTypography.b1_bold,
        defaultSoptkathonTypography.b1_medium,
        defaultSoptkathonTypography.b2_bold,
        defaultSoptkathonTypography.b2_medium,
        defaultSoptkathonTypography.c1_bold,
        defaultSoptkathonTypography.c1_medium,
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
