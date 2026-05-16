package org.sopt.soptkathon_android_2.core.designsystem.component

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
import androidx.compose.ui.unit.dp
import org.sopt.soptkathon_android_2.R
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.core.util.noRippleClickable

@Composable
fun SoptkathonTopBar(
    modifier: Modifier = Modifier,
    title: String = "",
    onBackClick: () -> Unit = {},
    iconColor: Color = Color.Unspecified,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = 4.dp),
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.ic_arrow_chevron_left_24),
            contentDescription = null,
            modifier = Modifier
                .noRippleClickable(onBackClick)
                .padding(all = 8.dp),
            tint = iconColor,
        )

        if (title.isNotEmpty()) {
            Text(
                text = title,
                modifier = Modifier.align(Alignment.Center),
                color = SoptkathonTheme.colors.gray1000,
                style = SoptkathonTheme.typography.b2Medium,
            )
        }
    }
}