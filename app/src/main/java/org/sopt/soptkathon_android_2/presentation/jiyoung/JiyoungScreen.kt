package org.sopt.soptkathon_android_2.presentation.jiyoung

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.sopt.soptkathon_android_2.R
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.core.util.noRippleClickable

@Composable
fun JiyoungRoute(
    navigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: JiyoungViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    JiyoungScreen(
        uiState = uiState,
        navigateToHome = navigateToHome,
        modifier = modifier,
    )
}

@Composable
private fun JiyoungScreen(
    uiState: JiyoungUiState,
    navigateToHome: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
            .padding(horizontal = 20.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 13.dp, bottom = 15.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "그룹 매칭",
                color = Color.Black,
                style = SoptkathonTheme.typography.b2Medium,
            )
        }

        Spacer(Modifier.height(31.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            Text(
                text = "비슷한 속도의",
                color = SoptkathonTheme.colors.gray500,
                style = SoptkathonTheme.typography.h1Bold.copy(fontSize = 26.sp),
            )

            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(
                    text = "두더지 3마리",
                    modifier = Modifier
                        .background(Color(0xFFFBF199))
                        .padding(horizontal = 4.dp),
                    color = SoptkathonTheme.colors.gray500,
                    style = SoptkathonTheme.typography.h1Bold.copy(fontSize = 26.sp),
                )

                Text(
                    text = "를",
                    color = SoptkathonTheme.colors.gray500,
                    style = SoptkathonTheme.typography.h1Bold.copy(fontSize = 26.sp),
                )
            }

            Text(
                text = "찾았어요",
                color = SoptkathonTheme.colors.gray500,
                style = SoptkathonTheme.typography.h1Bold.copy(fontSize = 26.sp),
            )
        }

        Spacer(Modifier.height(24.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = SoptkathonTheme.colors.gray50,
                        RoundedCornerShape(12.dp),
                    )
                    .padding(horizontal = 12.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(R.drawable.img_group_level1),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )

                Spacer(Modifier.width(12.dp))

                Column(
                    verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    Text(
                        text  = "김솝트",
                        color = SoptkathonTheme.colors.gray400,
                        style = SoptkathonTheme.typography.b1Bold,
                    )

                    Text(
                        text  = "틈새도전형 두더지",
                        color = SoptkathonTheme.colors.gray400,
                        style = SoptkathonTheme.typography.b2Medium,
                    )
                }
                
                Spacer(Modifier.weight(1f))

                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                ) {
                    Text(
                        text = "Lv.1",
                        modifier = Modifier
                            .background(Color(0xFFFBF199), RoundedCornerShape(10.dp))
                            .padding(horizontal = 8.dp, vertical = 2.dp),
                        color = SoptkathonTheme.colors.gray500,
                        style = SoptkathonTheme.typography.c1Medium,
                    )

                    Row(
                        modifier = Modifier.padding(end = 1.dp),
                        horizontalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        Text(
                            text = "누적",
                            color = SoptkathonTheme.colors.gray300,
                            style = SoptkathonTheme.typography.c1Medium,
                        )

                        Text(
                            text = "60m",
                            color = SoptkathonTheme.colors.gray300,
                            style = SoptkathonTheme.typography.c1Medium,
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = SoptkathonTheme.colors.gray50,
                        RoundedCornerShape(12.dp),
                    )
                    .padding(horizontal = 12.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(R.drawable.img_group_level1),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )

                Spacer(Modifier.width(12.dp))

                Column(
                    verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    Text(
                        text  = "감자",
                        color = SoptkathonTheme.colors.gray400,
                        style = SoptkathonTheme.typography.b1Bold,
                    )

                    Text(
                        text  = "틈새도전형 두더지",
                        color = SoptkathonTheme.colors.gray400,
                        style = SoptkathonTheme.typography.b2Medium,
                    )
                }

                Spacer(Modifier.weight(1f))

                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                ) {
                    Text(
                        text = "Lv.1",
                        modifier = Modifier
                            .background(Color(0xFFFBF199), RoundedCornerShape(10.dp))
                            .padding(horizontal = 8.dp, vertical = 2.dp),
                        color = SoptkathonTheme.colors.gray500,
                        style = SoptkathonTheme.typography.c1Medium,
                    )

                    Row(
                        modifier = Modifier.padding(end = 1.dp),
                        horizontalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        Text(
                            text = "누적",
                            color = SoptkathonTheme.colors.gray300,
                            style = SoptkathonTheme.typography.c1Medium,
                        )

                        Text(
                            text = "10m",
                            color = SoptkathonTheme.colors.gray300,
                            style = SoptkathonTheme.typography.c1Medium,
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 1.dp,
                        color = SoptkathonTheme.colors.gray50,
                        RoundedCornerShape(12.dp),
                    )
                    .padding(horizontal = 12.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(R.drawable.img_group_level2),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )

                Spacer(Modifier.width(12.dp))

                Column(
                    verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    Text(
                        text  = "숭숭이",
                        color = SoptkathonTheme.colors.gray400,
                        style = SoptkathonTheme.typography.b1Bold,
                    )

                    Text(
                        text  = "틈새도전형 두더지",
                        color = SoptkathonTheme.colors.gray400,
                        style = SoptkathonTheme.typography.b2Medium,
                    )
                }

                Spacer(Modifier.weight(1f))

                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                ) {
                    Text(
                        text = "Lv.2",
                        modifier = Modifier
                            .background(Color(0xFFFBF199), RoundedCornerShape(10.dp))
                            .padding(horizontal = 8.dp, vertical = 2.dp),
                        color = SoptkathonTheme.colors.gray500,
                        style = SoptkathonTheme.typography.c1Medium,
                    )

                    Row(
                        modifier = Modifier.padding(end = 1.dp),
                        horizontalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        Text(
                            text = "누적",
                            color = SoptkathonTheme.colors.gray300,
                            style = SoptkathonTheme.typography.c1Medium,
                        )

                        Text(
                            text = "100m",
                            color = SoptkathonTheme.colors.gray300,
                            style = SoptkathonTheme.typography.c1Medium,
                        )
                    }
                }
            }
        }

        Spacer(Modifier.weight(1f))

        Text(
            text = "이 그룹으로 시작하기",
            modifier = Modifier
                .fillMaxWidth()
                .noRippleClickable(navigateToHome)
                .background(SoptkathonTheme.colors.gray500, RoundedCornerShape(12.dp))
                .padding(vertical = 14.dp),
            color = SoptkathonTheme.colors.gray00,
            style= SoptkathonTheme.typography.b2Medium,
            textAlign = TextAlign.Center,
        )

        Spacer(Modifier.height(12.dp))
    }
}

@Preview
@Composable
private fun JiyoungScreenPreveiw() {
    SoptkathonTheme {
        JiyoungScreen(
            uiState = JiyoungUiState(),
            navigateToHome = {},
            )
    }
}