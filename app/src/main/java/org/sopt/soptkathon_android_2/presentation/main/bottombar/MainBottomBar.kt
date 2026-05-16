package org.sopt.soptkathon_android_2.presentation.main.bottombar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import org.sopt.soptkathon_android_2.core.designsystem.theme.SoptkathonTheme
import org.sopt.soptkathon_android_2.core.util.figmaDropShadow
import org.sopt.soptkathon_android_2.core.util.noRippleClickable

@Composable
fun MainBottomBar(
    currentTab: MainTab?,
    onTabSelected: (MainTab) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .figmaDropShadow(
                shape = CircleShape,
                dpOffset = DpOffset(0.dp, 2.dp),
                blur = 6.dp,
                spread = 0.dp,
                color = SoptkathonTheme.colors.gray1000.copy(alpha = 0.08f)
            )
            .clip(CircleShape)
            .background(SoptkathonTheme.colors.gray00)
            .padding(horizontal = 6.dp, vertical = 4.dp),
    ) {
        MainTab.entries.forEach { tab ->
            MainNavigationBarItem(
                tab = tab,
                onClick = { onTabSelected(tab) },
                selected = tab == currentTab,
                modifier = Modifier.weight(1f),
            )
        }
    }
}

@Composable
private fun MainNavigationBarItem(
    tab: MainTab,
    onClick: () -> Unit,
    selected: Boolean,
    modifier: Modifier = Modifier,
) {
    val color = if (selected) SoptkathonTheme.colors.gray500 else SoptkathonTheme.colors.gray50

    Column(
        modifier = modifier
            .background(
                if (selected) Color(0xFFFDF7C4) else Color.Transparent,
                CircleShape
            )
            .padding(vertical = 4.dp)
            .semantics(mergeDescendants = true) { role = Role.Tab }
            .noRippleClickable(onClick),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(tab.iconRes),
            contentDescription = null,
            tint = color,
        )

        Text(
            text = tab.label,
            color = color,
            style = SoptkathonTheme.typography.c1Medium,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MainBottomBarPreview() {
    SoptkathonTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            MainBottomBar(
                currentTab = MainTab.HOME,
                onTabSelected = {},
            )
        }
    }
}