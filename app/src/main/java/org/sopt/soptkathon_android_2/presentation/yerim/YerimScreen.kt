package org.sopt.soptkathon_android_2.presentation.yerim


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.sopt.soptkathon_android_2.R

import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.sopt.soptkathon_android_2.core.designsystem.component.SoptkathonTopBar
import org.sopt.soptkathon_android_2.core.designsystem.theme.defaultSoptkathonColor
import org.sopt.soptkathon_android_2.core.designsystem.theme.defaultSoptkathonTypography


@Composable
fun YerimRoute(
    navigateToDoyeon: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: YerimViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    YerimScreen(
        uiState = uiState,
        navigateToDoyeon = navigateToDoyeon,
        modifier = modifier,
    )
}

@Composable
private fun YerimScreen(
    uiState: YerimUiState,
    navigateToDoyeon: () -> Unit,
    modifier: Modifier = Modifier,
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        SoptkathonTopBar(
            title = "유형 결과",
        )
        Spacer(modifier = Modifier.height(4.dp))

        ResultCard(modifier = Modifier.padding(horizontal = 20.dp))

        Spacer(modifier = Modifier.height(16.dp))

        MissionInfoBox(modifier = Modifier.padding(horizontal = 20.dp))

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier =Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(
                space = 12.dp,
            ) ,
            verticalAlignment = Alignment.CenterVertically

        ) {
            MissionButton(
                text = "다시 진단하기",
                selected = false,
                onClick = { },
                modifier = Modifier.weight(1f)
            )

            MissionButton(
                text = "나의 굴 만들기",
                selected = true,
                onClick = navigateToDoyeon,
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
    }
}


@Composable
private fun ResultCard(
    modifier : Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFFFBF199),
                shape = RoundedCornerShape(32.dp)
            )
            .padding(20.dp)
    ) {

        Text(
            text = "나의 두비티아이는?",
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(30.dp)
                )
                .padding(horizontal=10.dp, vertical=6.dp),
            style = defaultSoptkathonTypography.c1Medium
        )

        Image(
            painter = painterResource(id = R.drawable.image_40),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(272.dp)
                .height(173.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "틈새도전형 두더지",
            color = defaultSoptkathonColor.gray1000,
            style = defaultSoptkathonTypography.h1Bold,
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "밖에 대한 궁금증도 있고,\n작은 행동 미션에도 잘 반응하는 타입,\n말보다는 함께 존재하는 경험에서 안정감을 느낌",
            style = defaultSoptkathonTypography.b2Medium,
            modifier = Modifier)
    }

}


@Composable
fun MissionInfoBox(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        MissionInfoItem(
            title = "나에게 잘 맞는 미션",
            description = "창문 열기 · 하늘 사진찍기 · 짧은 안부"
        )

        MissionDivider()

        MissionInfoItem(
            title = "조심해야 할 자극",
            description = "예고없이 많은 사람 · 빠른 응답 요구하기"
        )

        MissionDivider()

        MissionInfoItem(
            title = "비슷한 속도의 친구",
            description = "굴정리형 · 조심교류형"
        )
    }
}


@Composable
private fun MissionInfoItem(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = title,
            style = defaultSoptkathonTypography.b2Bold,
            color = defaultSoptkathonColor.gray400
        )

        Text(
            text = description,
            style = defaultSoptkathonTypography.c1Medium,
            color = defaultSoptkathonColor.gray400
        )
    }
}

@Composable
private fun MissionDivider() {
    HorizontalDivider(
        color = defaultSoptkathonColor.gray50,
        thickness = 1.dp
    )
}

@Composable
private fun MissionButton(
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val backgroundColor = if (selected) {
        defaultSoptkathonColor.gray500
    } else {
        defaultSoptkathonColor.gray50
    }

    val textColor = if (selected) {
        defaultSoptkathonColor.gray00
    } else {
        defaultSoptkathonColor.gray400
    }

    Box(
        modifier = modifier
            .height(48.dp)
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(12.dp)
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = defaultSoptkathonTypography.b1Medium.copy(fontSize = 14.sp),
            color = textColor
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun YerimScreenPreview() {
    YerimScreen(
        uiState = YerimUiState(),
        navigateToDoyeon = {}
    )
}