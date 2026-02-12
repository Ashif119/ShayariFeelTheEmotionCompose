package com.itandcstech.shayarifeeltheemotion.routes

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.itandcstech.shayarifeeltheemotion.CategoryScreen
import com.itandcstech.shayarifeeltheemotion.SplashScreen
import com.itandcstech.shayarifeeltheemotion.ui.ShayariListScreen
import com.itandcstech.shayarifeeltheemotion.ui.ShayariScreen

/**
 * @Created by Ashif on 11-02-2026
 * Know more about author at https://ashif.nexmerce.in
 */
@Composable
fun AppRoutes(modifier: Modifier = Modifier) {
    val mainNavController = rememberNavController()
    NavHost(
        mainNavController,
        modifier = modifier,
        startDestination =  Destinations.SplashScreen.route
    ) {
        composable(Destinations.SplashScreen.route) { SplashScreen(mainNavController) }
        composable(Destinations.CategoryScreen.route) { CategoryScreen(mainNavController) }
        composable(
            Destinations.ShayariListScreen.route+"/{title}",
        ) {
            val title = it.arguments?.getString("title")
            ShayariListScreen(mainNavController,title.toString()) }
        composable(
            Destinations.ShayariScreen.route+"/{title}"+"/{shayari}",
        ) {
            val title = it.arguments?.getString("title")
            val shayari = it.arguments?.getString("shayari")
            ShayariScreen(mainNavController,title.toString(),shayari.toString()) }
    }
}