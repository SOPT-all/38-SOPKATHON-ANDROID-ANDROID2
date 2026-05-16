package org.sopt.soptkathon_android_2.presentation.dubti.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DubtiProgressbar(
    pageCount: Int,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Gray, CircleShape)
            .height(10.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(fraction = pageCount / 3f)
                .background(Color.Black, CircleShape)
                .height(10.dp)
        )
    }
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
