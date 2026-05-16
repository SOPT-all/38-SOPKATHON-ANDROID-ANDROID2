package org.sopt.soptkathon_android_2.presentation.main.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.sopt.soptkathon_android_2.presentation.doyeon.DoyeonRoute
import org.sopt.soptkathon_android_2.presentation.dubti.DubtiRoute
import org.sopt.soptkathon_android_2.presentation.home.HomeRoute
import org.sopt.soptkathon_android_2.presentation.jiyoung.JiyoungRoute
import org.sopt.soptkathon_android_2.presentation.mission.MissionRoute
import org.sopt.soptkathon_android_2.presentation.onboarding.OnboardingRoute
import org.sopt.soptkathon_android_2.presentation.splash.SplashScreen
import org.sopt.soptkathon_android_2.presentation.yerim.YerimRoute

@Composable
fun MainNavHost(
    navigator: MainNavigator,
    paddingValues: PaddingValues,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navigator.navController,
        startDestination = Home,
        modifier = modifier.fillMaxSize(),
        enterTransition = { fadeIn(tween(160)) },
        exitTransition = { fadeOut(tween(160)) },
        popEnterTransition = { fadeIn(tween(160)) },
        popExitTransition = { fadeOut(tween(160)) },
    ) {
        composable<Splash> {
            SplashScreen(
                navigateToOnboarding = navigator.navController::navigateToOnboarding,
            )
        }

        composable<Onboarding> {
            OnboardingRoute(
                navigateToDubti = navigator.navController::navigateToDubti,
                modifier = Modifier.padding(paddingValues),
            )
        }

        composable<Dubti> {
            DubtiRoute(
                navigateToYerim = navigator.navController::navigateToYerim,
                modifier = Modifier.padding(paddingValues),
            )
        }

        composable<Doyeon> {
            DoyeonRoute(
                navigateToJiyoung = navigator.navController::navigateToJiyoung,
                modifier = Modifier.padding(paddingValues),
            )
        }

        composable<Jiyoung> {
            JiyoungRoute(
                navigateToYerim = navigator.navController::navigateToYerim,
                modifier = Modifier.padding(paddingValues),
            )
        }

        composable<Yerim> {
            YerimRoute(
                navigateToDoyeon = navigator.navController::navigateToDoyeon,
                modifier = Modifier.padding(paddingValues),
            )
        }
        
        composable<Home> {
            HomeRoute(
                navigateToMission = navigator.navController::navigateToMission,
            )
        }
        
        composable<Mission> {
            MissionRoute(
                navigateToHome = navigator.navController::navigateToHome,
                modifier = Modifier.padding(paddingValues),
            )
        }
    }
}
