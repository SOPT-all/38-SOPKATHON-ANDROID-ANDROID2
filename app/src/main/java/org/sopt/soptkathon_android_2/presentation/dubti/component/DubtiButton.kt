package org.sopt.soptkathon_android_2.presentation.dubti.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme

@Composable
fun DubtiButton(
    answer: String,
    content: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var isPressed by remember { mutableStateOf(false) }

    Row(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))

            .fillMaxWidth()
            .background(
                if (isPressed) SoptkathonTheme.colors.gray1000 else SoptkathonTheme.colors.gray00,
            )
            .pointerInput(Unit) {
                detectTapGestures(
                    onPress = {
                        isPressed = true
                        tryAwaitRelease()
                        isPressed = false
                    },
                    onTap = { onClick() }
                )
            }
            .border(
                width = 1.dp,
                color = if (isPressed) SoptkathonTheme.colors.gray1000 else SoptkathonTheme.colors.gray50,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(horizontal = 12.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(30.dp)
                .background(
                    if (isPressed) SoptkathonTheme.colors.yellow500 else SoptkathonTheme.colors.gray50,
                    RoundedCornerShape(8.dp)
                ),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = answer,
                color = SoptkathonTheme.colors.gray500,
                style = SoptkathonTheme.typography.b2Medium,
            )
        }

        Text(
            text = content,
            color = if (isPressed)SoptkathonTheme.colors.gray00 else SoptkathonTheme.colors.gray1000,
            style = SoptkathonTheme.typography.b2Medium,
        )
    }
}

@Preview
@Composable
private fun DubtiButtonPreview() {
    SoptkathonTheme {
        Column(){
            DubtiButton(
                answer = "A",
                content = "아아아ㅏ",
                onClick = { },
            )

            DubtiButton(
                answer = "A",
                content = "아아아ㅏ",
                onClick = { },
            )
        }
    }
}