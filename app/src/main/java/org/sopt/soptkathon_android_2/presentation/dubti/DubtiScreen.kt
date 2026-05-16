package org.sopt.soptkathon_android_2.presentation.dubti

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.presentation.dubti.component.DubtiProgressbar
import org.sopt.soptkathon_android_2.presentation.dubti.component.DubtiQuestionSection
import org.sopt.soptkathon_android_2.presentation.dubti.component.DubtiTopBar

@Composable
fun DubtiRoute(
    navigateToYerim: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: DubtiViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(viewModel.uiEffect) {
        viewModel.uiEffect.collect {
            when (it) {
                DubtiUiEffect.NavigateToDoyeon -> navigateToYerim()
            }
        }
    }

    when (uiState.isLoading) {
        true -> Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            CircularProgressIndicator()
        }

        false -> DubtiScreen(
            uiState = uiState,
            onAnswerClick = {
                when (uiState.pageCount) {
                    1 -> viewModel.onAnswer1Click(it)
                    2 -> viewModel.onAnswer2Click(it)
                    else -> viewModel.onAnswer3Click(it)
                }
            },
            modifier = modifier,
        )
    }
}

@Composable
private fun DubtiScreen(
    uiState: DubtiUiState,
    onAnswerClick: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(SoptkathonTheme.colors.gray00),
    ) {
        DubtiTopBar()

        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            DubtiProgressbar(
                pageCount = uiState.pageCount,
            )

            Spacer(Modifier.height(32.dp))

            Text(
                text = "Q${uiState.pageCount}",
                color = SoptkathonTheme.colors.gray1000,
                style = SoptkathonTheme.typography.h1Medium,
            )

            Spacer(Modifier.height(12.dp))

            Text(
                text = uiState.question,
                color = SoptkathonTheme.colors.gray500,
                style = SoptkathonTheme.typography.t1Bold,
            )

            Spacer(Modifier.height(8.dp))

            Text(
                text = uiState.description,
                color = SoptkathonTheme.colors.gray200,
                style = SoptkathonTheme.typography.b2Medium,
            )

            Spacer(Modifier.height(40.dp))

            DubtiQuestionSection(
                aContent = uiState.aContent,
                bContent = uiState.bContent,
                onClick = onAnswerClick,
            )
        }
    }
}

@Preview
@Composable
private fun DubtiScreenPreview() {
    DubtiScreen(
        uiState = DubtiUiState(),
        onAnswerClick = {},
    )
}
