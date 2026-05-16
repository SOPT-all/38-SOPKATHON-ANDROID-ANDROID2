package org.sopt.soptkathon_android_2.presentation.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.core.util.noRippleClickable

@Composable
fun OnboardingRoute(
    navigateToDubti: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: OnboardingViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    OnboardingScreen(
        uiState = uiState,
        navigateToDubti = navigateToDubti,
        modifier = modifier,
    )
}

@Composable
private fun OnboardingScreen(
    uiState: OnboardingUiState,
    navigateToDubti: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val pagerState = rememberPagerState(pageCount = { 3 })

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            repeat(pagerState.pageCount) { current ->
                val color = when (current) {
                    pagerState.currentPage -> SoptkathonTheme.colors.dummy
                    else -> SoptkathonTheme.colors.dummy
                }

                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .background(color, CircleShape),
                )
            }
        }

        HorizontalPager(
            modifier = Modifier.fillMaxWidth(),
            state = pagerState,
        ) {
            val imageRes = when (it) {
                0 -> 0
                else -> 1
            }

            val title = when (it) {
                0 -> "혼자가 아니에요"
                else -> "연결되는 경험을 만들어요"
            }

            val description = when (it) {
                0 -> "비슷한 머뭇거림을 가진 사람들이\n여기 모여 있어요"
                else -> "비슷한 속도의 사람들과 한 발씩,\n다시 연결되는 경험을 만들어요"
            }

            when (it) {
                0, 1 -> Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(30.dp),
                ) {
//                    Image(
//                        painter = painterResource(imageRes),
//                        contentDescription = null,
//                        modifier = Modifier,
//                        contentScale = ContentScale.Fit,
//                    )

                    Text(
                        text = title,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                    )

                    Text(
                        text = description,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                    )
                }

                else -> Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "두비티아이 진단",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                    )

                    Text(
                        text = "현재 사회화 부담도를 알아보는 30초 테스트",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                    )

                    Text(
                        text = "진단 시작하기",
                        modifier = Modifier
                            .fillMaxWidth()
                            .noRippleClickable(navigateToDubti),
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
    }
}
