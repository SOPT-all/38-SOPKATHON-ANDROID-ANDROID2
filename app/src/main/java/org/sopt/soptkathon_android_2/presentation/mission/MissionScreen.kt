package org.sopt.soptkathon_android_2.presentation.mission

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.sopt.soptkathon_android_2.R
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.core.util.noRippleClickable
import org.sopt.soptkathon_android_2.presentation.main.bottombar.MainBottomBar
import org.sopt.soptkathon_android_2.presentation.main.bottombar.MainTab

data class Mission(val title: String, val subtitle: String)

@Composable
fun MissionRoute(
    navigateToHome: () -> Unit,
    navigateToMissionDetail: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: MissionViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    MissionScreen(
        uiState = uiState,
        navigateToMissionDetail = navigateToMissionDetail,
        navigateToHome = navigateToHome,
        modifier = modifier,
    )
}

@Composable
private fun MissionScreen(
    uiState: MissionUiState,
    navigateToMissionDetail: () -> Unit,
    navigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val missionList = listOf(
        Mission("하늘 사진 찍기", "중간 미션 · 예상 1분"),
        Mission("현관문 앞 30초 서 있기", "중간 미션 · 예상 1분"),
        Mission("집 앞 5분 걷기", "중간 미션 · 예상 5분"),
        Mission("편의점 다녀오기", "중간 미션 · 예상 10분"),
    )

    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            MainBottomBar(
                currentTab = MainTab.MISSION,
                onClick = navigateToHome,
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            Text(
                text = "미션",
                style = SoptkathonTheme.typography.b2Medium,
                color = SoptkathonTheme.colors.gray1000,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 13.dp, bottom = 7.dp),
                textAlign = TextAlign.Center
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 8.dp)
                    .background(
                        color = Color(0xFFFBF199),
                        shape = RoundedCornerShape(32.dp)
                    )
                    .padding(all = 22.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_mission_water),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(top = 32.dp)
                )

                Column {
                    Box(
                        modifier = Modifier
                            .background(
                                color = SoptkathonTheme.colors.gray00,
                                shape = RoundedCornerShape(30.dp)
                            )
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "틈새도전형 추천",
                            style = SoptkathonTheme.typography.c1Medium,
                            color = SoptkathonTheme.colors.gray400
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "물 한 잔 마시기",
                        style = SoptkathonTheme.typography.h1Bold,
                        color = SoptkathonTheme.colors.gray500
                    )

                    Text(
                        text = "쉬운 미션 · 예상 1분",
                        style = SoptkathonTheme.typography.b2Medium,
                        color = SoptkathonTheme.colors.gray400
                    )

                    Spacer(modifier = Modifier.height(40.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "몸과 마음을 깨우기 위해\n천천히 물 한 잔을 마셔보세요.",
                            style = SoptkathonTheme.typography.b2Medium,
                            color = SoptkathonTheme.colors.gray400
                        )

                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.ic_arrow_chevron_right_44),
                            contentDescription = null,
                            tint = Color.Unspecified
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .background(SoptkathonTheme.colors.gray50, shape = RoundedCornerShape(99.dp))
                    .padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "쉬움",
                    color = SoptkathonTheme.colors.gray500,
                    style = SoptkathonTheme.typography.c1Medium,
                    modifier = Modifier.padding(horizontal = 38.dp, vertical = 11.5.dp)
                )

                Text(
                    text = "중간",
                    color = SoptkathonTheme.colors.gray00,
                    style = SoptkathonTheme.typography.c1Medium,
                    modifier = Modifier
                        .background(
                            SoptkathonTheme.colors.gray500,
                            shape = RoundedCornerShape(99.dp)
                        )
                        .padding(horizontal = 38.dp, vertical = 11.5.dp)
                )

                Text(
                    text = "어려움",
                    color = SoptkathonTheme.colors.gray500,
                    style = SoptkathonTheme.typography.c1Medium,
                    modifier = Modifier.padding(horizontal = 38.dp, vertical = 11.5.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
            ) {
                items(items = missionList) { mission ->
                    MissionItem(
                        title = mission.title,
                        subtitle = mission.subtitle,
                        onClick = navigateToMissionDetail,
                    )
                }
            }
        }
    }
}

@Composable
fun MissionItem(
    title: String,
    subtitle: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .noRippleClickable(onClick)
            .background(
                color = SoptkathonTheme.colors.gray00,
                shape = RoundedCornerShape(12.dp)
            )
            .border(
                width = 1.dp,
                color = SoptkathonTheme.colors.gray50,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(top = 13.dp, bottom = 14.dp)
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = title,
                style = SoptkathonTheme.typography.b2Medium,
                color = SoptkathonTheme.colors.gray500
            )
            Text(
                text = subtitle,
                style = SoptkathonTheme.typography.c1Medium,
                color = SoptkathonTheme.colors.gray200
            )
        }

        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.ic_arrow_chevron_right_20),
            contentDescription = null,
            tint = SoptkathonTheme.colors.gray500
        )
    }
}

@Preview(showBackground = true, heightDp = 708, widthDp = 360)
@Composable
private fun MissionScreenPreview() {
    SoptkathonTheme {
        MissionScreen(
            uiState = MissionUiState(),
            navigateToMissionDetail = {},
            navigateToHome = {},
        )
    }
}