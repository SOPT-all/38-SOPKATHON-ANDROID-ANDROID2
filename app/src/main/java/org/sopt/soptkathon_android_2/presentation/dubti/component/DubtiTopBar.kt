package org.sopt.soptkathon_android_2.presentation.dubti.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.sopt.soptkathon_android_2.R
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme

@Composable
fun DubtiTopBar(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = 4.dp),
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.ic_arrow_chevron_left_24),
            contentDescription = null,
            modifier = Modifier.padding(all = 8.dp),
            tint = Color.Unspecified,
        )


        Text(
            text = "두비티아이",
            modifier = Modifier.align(Alignment.Center),
            color = SoptkathonTheme.colors.gray1000,
            style = SoptkathonTheme.typography.b2Medium,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DubtiTopBarPreview() {
    DubtiTopBar()
}