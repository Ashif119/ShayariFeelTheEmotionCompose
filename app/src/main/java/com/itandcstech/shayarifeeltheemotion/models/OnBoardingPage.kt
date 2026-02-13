package com.itandcstech.shayarifeeltheemotion.models

import androidx.compose.ui.graphics.Color

data class OnBoardingPage(
    val title: String,
    val description: String,
    val image: Int,
    val gradientColors: List<Color>
)
