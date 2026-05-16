package org.sopt.soptkathon_android_2.core.util

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset

inline fun Modifier.noRippleClickable(
    crossinline onClick: () -> Unit,
    enabled: Boolean = true,
): Modifier =
    composed {
        clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() },
            enabled = enabled,
        ) {
            onClick()
        }
    }

fun Modifier.figmaDropShadow(
    shape: Shape,
    dpOffset: DpOffset,
    blur: Dp,
    spread: Dp,
    color: Color,
): Modifier {
    return this.dropShadow(
        shape = shape,
        shadow = Shadow(
            radius = blur,
            color = color,
            offset = dpOffset,
            spread = spread,
        ),
    )
}
