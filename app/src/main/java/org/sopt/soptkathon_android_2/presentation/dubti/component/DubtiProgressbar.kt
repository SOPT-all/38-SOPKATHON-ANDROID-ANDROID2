package org.sopt.soptkathon_android_2.presentation.dubti.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme

@Composable
fun DubtiProgressbar(
    pageCount: Int,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(3) {
            Step(
                active = it <= pageCount,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Step(
    active: Boolean,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .background(
                if (active) SoptkathonTheme.colors.gray1000 else SoptkathonTheme.colors.gray50,
                CircleShape
            )
            .height(4.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DubtiProgressbarPreview() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        DubtiProgressbar(pageCount = 1)
        DubtiProgressbar(pageCount = 2)
        DubtiProgressbar(pageCount = 3)
    }
}
