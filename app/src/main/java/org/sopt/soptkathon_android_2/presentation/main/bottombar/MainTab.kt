package org.sopt.soptkathon_android_2.presentation.main.bottombar

import androidx.annotation.DrawableRes
import org.sopt.soptkathon_android_2.R
import org.sopt.soptkathon_android_2.core.navigation.Route
import org.sopt.soptkathon_android_2.presentation.main.navigation.Group
import org.sopt.soptkathon_android_2.presentation.main.navigation.Home
import org.sopt.soptkathon_android_2.presentation.main.navigation.Mission

enum class MainTab(
    @get:DrawableRes val iconRes: Int,
    val label: String,
    val route: Route,
) {
    HOME(
        iconRes = R.drawable.ic_bottombar_home,
        label = "홈",
        route = Home,
    ),
    MISSION(
        iconRes = R.drawable.ic_bottombar_star,
        label = "미션",
        route = Mission,
    ),
    GROUP(
        iconRes = R.drawable.ic_bottombar_user,
        label = "그룹",
        route = Group,
    ),
    SETTING(
        iconRes = R.drawable.ic_bottombar_settings,
        label = "설정",
        route = Group,
    )
}
