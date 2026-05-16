package org.sopt.soptkathon_android_2.presentation.dubti

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
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
        modifier = modifier.fillMaxSize(),
    ) {
        DubtiTopBar()

        DubtiProgressbar(
            pageCount = uiState.pageCount,
        )

        DubtiQuestionSection(
            question = uiState.question,
            aContent = uiState.aContent,
            bContent = uiState.bContent,
            onClick = onAnswerClick,
        )
    }
}
