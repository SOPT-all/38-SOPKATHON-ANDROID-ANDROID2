package org.sopt.soptkathon_android_2.presentation.dubti.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.sopt.soptkathon_android_2.core.util.noRippleClickable

@Composable
fun DubtiButton(
    answer: String,
    content: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth().noRippleClickable(onClick),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text(
            text = answer,
        )

        Text(
            text = content,
        )
    }
}
