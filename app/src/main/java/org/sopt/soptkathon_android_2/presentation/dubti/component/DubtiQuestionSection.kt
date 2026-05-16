package org.sopt.soptkathon_android_2.presentation.dubti.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DubtiQuestionSection(
    question: String,
    aContent: String,
    bContent: String,
    onClick: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text(
            text = question,
        )

        DubtiButton(
            answer = "a",
            content = aContent,
            onClick = { onClick("a") },
        )

        DubtiButton(
            answer = "b",
            content = bContent,
            onClick = { onClick("b") },
        )
    }
}
