package com.itandcstech.shayarifeeltheemotion.routes

import androidx.annotation.DrawableRes

/**
 * @Created by Ashif on 11-02-2026
 * Know more about author at https://ashif.nexmerce.in
 */
sealed class Destinations(val route: String, val label: String, @DrawableRes val icon:Int?=null) {
    data object SplashScreen : Destinations("splashScreen", "SplashScreen")
    data object OnBoardingScreen : Destinations("onBoardingScreen", "OnBoardingScreen")
    data object CategoryScreen : Destinations("categoryScreen", "CategoryScreen")
    data object ShayariListScreen : Destinations("shayariListScreen", "ShayariListScreen")
    data object ShayariScreen : Destinations("shayariScreen", "ShayariScreen")
}