package org.sopt.soptkathon_android_2.presentation.dubti.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DubtiTopBar(
    pageCount: Int,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White),
    ) {
//        Icon(
//            imageVector = ImageVector.vectorResource(),
//            contentDescription = null,
//            tint = Color.Unspecified,
//        )

        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(
                text = "두비티아이",
            )

            Text(
                text = "$pageCount/3",
            )
        }
    }
}

@Preview
@Composable
private fun DubtiTopBarPreview() {
    DubtiTopBar(1)
}