package org.sopt.soptkathon_android_2.presentation.main.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

fun NavController.navigateToDoyeon() {
    navigate(Doyeon)
}

fun NavController.navigateToJiyoung() {
    navigate(Jiyoung)
}

fun NavController.navigateToYerim() {
    navigate(Yerim)
}

class MainNavigator(
    val navController: NavHostController,
) {
    private val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination
}

@Composable
fun rememberSoptkathonNavigator(navController: NavHostController = rememberNavController()): MainNavigator =
    remember(navController) {
        MainNavigator(navController)
    }
