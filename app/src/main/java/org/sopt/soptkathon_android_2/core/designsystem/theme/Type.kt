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
    val h1Medium: TextStyle,
    val h1Bold: TextStyle,

    val t1Bold: TextStyle,
    val t2Bold: TextStyle,
    val t2Medium: TextStyle,

    val b1Bold: TextStyle,
    val b1Medium: TextStyle,
    val b2Bold: TextStyle,
    val b2Medium: TextStyle,
    val c1Bold: TextStyle,
    val c1Medium: TextStyle,
)

val defaultSoptkathonTypography = SoptkathonTypography(
    h1Medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 48.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    h1Bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 26.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    t1Bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 22.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    t2Bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 18.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    t2Medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 18.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    b1Bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 16.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    b1Medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 16.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    b2Bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 14.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    b2Medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 14.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    c1Bold = soptkathonTextStyle(
        fontFamily = SoptkathonFont.bold,
        weight = FontWeight.Bold,
        size = 12.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
    c1Medium = soptkathonTextStyle(
        fontFamily = SoptkathonFont.medium,
        weight = FontWeight.Medium,
        size = 12.sp,
        lineHeight = 1.4.em,
        letterSpacing = 0.em,
    ),
)

val LocalSoptkathonTypography = staticCompositionLocalOf { defaultSoptkathonTypography }

@Preview
@Composable
private fun SoptkathonTypographyPreview() {
    val typography = listOf(
        defaultSoptkathonTypography.h1Medium,
        defaultSoptkathonTypography.h1Bold,
        defaultSoptkathonTypography.t1Bold,
        defaultSoptkathonTypography.t2Bold,
        defaultSoptkathonTypography.t2Medium,
        defaultSoptkathonTypography.b1Bold,
        defaultSoptkathonTypography.b1Medium,
        defaultSoptkathonTypography.b2Bold,
        defaultSoptkathonTypography.b2Medium,
        defaultSoptkathonTypography.c1Bold,
        defaultSoptkathonTypography.c1Medium,
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
