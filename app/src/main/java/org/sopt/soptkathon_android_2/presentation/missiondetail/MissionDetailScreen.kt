package org.sopt.soptkathon_android_2.presentation.missiondetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.sopt.soptkathon_android_2.R
import org.sopt.soptkathon_android_2.core.designsystem.component.SoptkathonTopBar
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.presentation.missiondetail.component.MissionDetailButton

@Composable
fun MissionDetailRoute(
    navigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: MissionDetailViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    when (uiState.step) {
        0 -> MissionDetailScreen(
            onClick = viewModel::onStart,
            modifier = modifier,
        )

        else -> MissionSuccessScreen(
            onClick = {
                viewModel.onComplete()
                navigateToHome()
            },
        )
    }
}

@Composable
private fun MissionDetailScreen(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "미션 상세 조회",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 13.dp, bottom = 23.dp),
            color = SoptkathonTheme.colors.gray1000,
            style = SoptkathonTheme.typography.b2Medium,
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFBF199), RoundedCornerShape(32.dp))
        ) {
            Image(
                painter = painterResource(R.drawable.img_mission_detail),
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(32.dp))
                    .fillMaxWidth()
            )

            Column(
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                Spacer(Modifier.height(16.dp))

                Text(
                    text = "하늘 사진 찍기",
                    color = Color(0xFF111827),
                    style = SoptkathonTheme.typography.h1Bold.copy(fontSize = 26.sp),
                )

                Spacer(Modifier.height(4.dp))

                Text(
                    text = "쉬운 미션 · 예상 1분",
                    color = SoptkathonTheme.colors.gray200,
                    style = SoptkathonTheme.typography.b2Medium,
                )

                Spacer(Modifier.height(40.dp))

                Image(
                    painter = painterResource(R.drawable.img_mission_detail_profiles),
                    contentDescription = null,
                    modifier = Modifier
                        .size(88.dp, 40.dp)
                )

                Spacer(Modifier.height(8.dp))

                Text(
                    text = "김솝트님 외 2명이 함께 참여하고 있어요",
                    color = SoptkathonTheme.colors.gray200,
                    style = SoptkathonTheme.typography.b2Medium,
                )

                Spacer(Modifier.height(22.dp))
            }
        }

        Spacer(Modifier.weight(1f))


        MissionDetailButton(
            text = "미션 시작하기",
            onClick = onClick,
        )
    }
}

@Preview
@Composable
private fun MissionDetailScreenPreveiw() {
    SoptkathonTheme {
        MissionDetailScreen(
            onClick = { },
        )
    }
}

@Composable
private fun MissionSuccessScreen(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFFBF199))
            .statusBarsPadding()
            .navigationBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SoptkathonTopBar(
            title = "미션 성공",
            iconColor = Color(0xFFFFFFFF),
        )

        Spacer(Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Lv.1",
                color = SoptkathonTheme.colors.gray500,
                style = SoptkathonTheme.typography.c1Medium,
            )

            Spacer(Modifier.weight(1f))

            Text(
                text = "90m",
                color = SoptkathonTheme.colors.gray500,
                style = SoptkathonTheme.typography.c1Medium,
            )

            Spacer(Modifier.width(4.dp))

            Text(
                text = "/",
                color = SoptkathonTheme.colors.gray500,
                style = SoptkathonTheme.typography.c1Medium,
            )

            Spacer(Modifier.width(4.dp))

            Text(
                text = "100m",
                color = SoptkathonTheme.colors.gray500,
                style = SoptkathonTheme.typography.c1Medium,
            )
        }

        Spacer(Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .height(4.dp)
                .background(SoptkathonTheme.colors.gray00, CircleShape),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(fraction = 0.9f)
                    .height(4.dp)
                    .background(SoptkathonTheme.colors.gray500, CircleShape)
            ) {}
        }

        Spacer(Modifier.weight(43f))

        Image(
            painter = painterResource(R.drawable.img_mission_detail_jump),
            contentDescription = null,
            modifier = Modifier.width(164.dp)
        )

        Spacer(Modifier.weight(31f))

        Text(
            text = "두더지가\n10m 올라왔어요",
            color = SoptkathonTheme.colors.gray1000,
            style = SoptkathonTheme.typography.h1Bold.copy(fontSize = 26.sp),
            textAlign = TextAlign.Center,
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "미션을 할수록 흙 밖으로 더 올라와요!",
            color = Color(0xFF353535),
            style = SoptkathonTheme.typography.b1Medium,
            textAlign = TextAlign.Center,
        )

        Spacer(Modifier.weight(42f))

        MissionDetailButton(
            text = "홈으로",
            onClick = onClick,
            modifier = Modifier.padding(horizontal = 20.dp)
        )
    }
}

@Preview
@Composable
private fun MissionSuccessScreenPreveiw() {
    SoptkathonTheme {
        MissionSuccessScreen(
            onClick = {},
        )
    }
}