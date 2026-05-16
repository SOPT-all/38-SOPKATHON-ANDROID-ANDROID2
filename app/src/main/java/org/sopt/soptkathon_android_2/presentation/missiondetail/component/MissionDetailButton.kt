package org.sopt.soptkathon_android_2.presentation.missiondetail.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.core.util.noRippleClickable

@Composable
fun MissionDetailButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .noRippleClickable(onClick)
            .fillMaxWidth()
            .padding(vertical = 12.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .background(SoptkathonTheme.colors.gray500)
                .padding(vertical = 14.dp),
            color = SoptkathonTheme.colors.gray00,
            textAlign = TextAlign.Center,
            style = SoptkathonTheme.typography.b2Medium,
        )
    }
}

@Preview
@Composable
private fun MissionDetailButtonPreview() {
    SoptkathonTheme{
        MissionDetailButton(
            text = "샤샤",
            onClick = {},
        )
    }
}