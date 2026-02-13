package com.itandcstech.shayarifeeltheemotion.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.itandcstech.shayarifeeltheemotion.R
import com.itandcstech.shayarifeeltheemotion.routes.Destinations
import com.itandcstech.shayarifeeltheemotion.util.PreferenceManager
import kotlinx.coroutines.delay

/**
 * @Created by Ashif on 11-02-2026
 * Know more about author at https://ashif.nexmerce.in
 */
@Composable
fun SplashScreen(mainNavController: NavHostController) {
    val context = LocalContext.current
    val pref = remember { PreferenceManager(context) }
    LaunchedEffect(key1 = true) {
        delay(3000)
        val targetRounte = if (pref.isFirstTime()) {
            Destinations.OnBoardingScreen.route
        } else {
            Destinations.CategoryScreen.route
        }
        mainNavController.navigate(targetRounte) {
            popUpTo(Destinations.SplashScreen.route) {
                inclusive = true
            }
        }
    }
    Surface() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.primary)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(painterResource(R.drawable.feel_the_emotion), contentDescription = null)
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 50.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.size(35.dp),
                    strokeWidth = 3.dp,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
        }
    }
}