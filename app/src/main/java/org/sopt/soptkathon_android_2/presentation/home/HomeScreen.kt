package org.sopt.soptkathon_android_2.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.sopt.soptkathon_android_2.R
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.presentation.main.bottombar.MainBottomBar
import org.sopt.soptkathon_android_2.presentation.main.bottombar.MainTab

@Composable
fun HomeRoute(
    navigateToMission: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    HomeScreen(
        uiState = uiState,
        navigateToMission = navigateToMission,
        modifier = modifier.background(SoptkathonTheme.colors.gray500),
    )
}

@Composable
private fun HomeScreen(
    uiState: HomeUiState,
    navigateToMission: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                MainBottomBar(
                    currentTab = MainTab.HOME,
                    onClick = navigateToMission,
                    modifier = Modifier.navigationBarsPadding()
                )
            }
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 20.dp),
            ) {
                Spacer(Modifier.height(32.dp))

                Text(
                    text = "두나우님은,",
                    color = Color(0xFFFFFDF2),
                    style = SoptkathonTheme.typography.t2Bold,
                )

                Text(
                    text = "굴 속에 숨은\n두더지",
                    color = Color(0xFFFFFDF2),
                    style = SoptkathonTheme.typography.h1Bold.copy(fontSize = 26.sp),
                )

                Image(
                    painter = painterResource(R.drawable.img_home_level1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(140.dp)
                        .align(Alignment.End),
                )

                Spacer(Modifier.height(10.dp))

                Text(
                    text = "Lv.1",
                    modifier = Modifier
                        .background(
                            color = Color(0xFFFBF199),
                            RoundedCornerShape(10.dp)
                        )
                        .padding(horizontal = 8.dp, vertical = 2.dp),
                    color = SoptkathonTheme.colors.gray500,
                    style = SoptkathonTheme.typography.c1Medium,
                )

                Spacer(Modifier.height(8.dp))

                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                        .background(
                            color = SoptkathonTheme.colors.gray300,
                            shape = CircleShape,
                        )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(fraction = 0.7f)
                            .height(4.dp)
                            .background(
                                color = Color(0xFFFBF199),
                                shape = CircleShape,
                            )
                    )
                }

                Spacer(Modifier.height(8.dp))

                Row {
                    Text(
                        text = "이번 달 작은 성공",
                        color = Color(0xFFFFFDF2),
                        style = SoptkathonTheme.typography.c1Medium,
                    )

                    Spacer(Modifier.width(4.dp))

                    Text(
                        text = "7개",
                        color = Color(0xFFFBF199),
                        style = SoptkathonTheme.typography.c1Bold,
                    )

                    Spacer(Modifier.width(16.dp))

                    Text(
                        text = "누적",
                        color = Color(0xFFFFFDF2),
                        style = SoptkathonTheme.typography.c1Medium,
                    )

                    Spacer(Modifier.width(4.dp))

                    Text(
                        text = "70m",
                        color = Color(0xFFFBF199),
                        style = SoptkathonTheme.typography.c1Bold,
                    )

                    Spacer(Modifier.width(4.dp))

                    Text(
                        text = "/100m",
                        color = SoptkathonTheme.colors.gray300,
                        style = SoptkathonTheme.typography.c1Bold,
                    )
                }

                Spacer(Modifier.height(35.dp))
            }

            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .weight(1f)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .background(SoptkathonTheme.colors.gray00)
                    .padding(horizontal = 20.dp)
                    .padding(top = 13.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "완료한 미션",
                        color = SoptkathonTheme.colors.gray500,
                        style = SoptkathonTheme.typography.b2Bold,
                    )

                    Text(
                        text = "4개",
                        color = SoptkathonTheme.colors.gray500,
                        style = SoptkathonTheme.typography.b2Bold,
                    )
                }

                Spacer(Modifier.height(16.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 1.dp,
                            color = SoptkathonTheme.colors.gray50,
                            shape = RoundedCornerShape(12.dp)
                        )
                        .padding(horizontal = 16.dp, vertical = 14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column {
                        Text(
                            text = "하늘 사진 찍기",
                            color = SoptkathonTheme.colors.gray500,
                            style = SoptkathonTheme.typography.b2Medium,
                        )

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "오늘",
                                color = SoptkathonTheme.colors.gray200,
                                style = SoptkathonTheme.typography.c1Medium,
                            )

                            Text(
                                text = "18:20",
                                color = SoptkathonTheme.colors.gray200,
                                style = SoptkathonTheme.typography.c1Medium,
                            )

                            Text(
                                text = "완료",
                                color = SoptkathonTheme.colors.gray200,
                                style = SoptkathonTheme.typography.c1Medium,
                            )
                        }
                    }

                    Icon(
                        painter = painterResource(R.drawable.img_circle_check),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreveiw() {
    SoptkathonTheme {
        HomeScreen(
            uiState = HomeUiState(),
            navigateToMission = {},
        )
    }
}