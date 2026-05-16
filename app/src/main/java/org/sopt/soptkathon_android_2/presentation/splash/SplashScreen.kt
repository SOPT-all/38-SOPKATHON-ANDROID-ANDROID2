package org.sopt.soptkathon_android_2.presentation.splash

import android.os.Build.VERSION.SDK_INT
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.ImageLoader
import coil3.compose.AsyncImage
import coil3.gif.AnimatedImageDecoder
import coil3.gif.GifDecoder
import coil3.request.ImageRequest
import coil3.request.crossfade
import kotlinx.coroutines.delay
import org.sopt.soptkathon_android_2.R

@Composable
fun SplashScreen(
    navigateToOnboarding: () -> Unit,
    modifier: Modifier = Modifier,
) {
    LaunchedEffect(Unit) {
        delay(2000)
        navigateToOnboarding()
    }

    val imageLoader = ImageLoader.Builder(LocalContext.current)
        .components {
            if (SDK_INT >= 28) {
                add(AnimatedImageDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()

    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Color(0XffF6E18B)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Spacer(Modifier.weight(151f))

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(R.drawable.splash)
                .crossfade(true)
                .build(),
            contentDescription = null,
            imageLoader = imageLoader,
            modifier = Modifier.width(304.dp)
        )

        Spacer(Modifier.weight(15f))

        Image(
            painter = painterResource(R.drawable.img_donow),
            contentDescription = null,
            modifier = Modifier.width(186.dp)
        )

        Spacer(Modifier.weight(81f))
    }
}

@Preview
@Composable
private fun SplashScreenPreveiw() {
    SplashScreen(
        navigateToOnboarding = {},
    )
}