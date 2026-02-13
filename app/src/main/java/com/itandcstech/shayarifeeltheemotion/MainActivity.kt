package com.itandcstech.shayarifeeltheemotion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.itandcstech.shayarifeeltheemotion.routes.AppNavigation
import com.itandcstech.shayarifeeltheemotion.ui.theme.ShayariFeelTheEmotionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShayariFeelTheEmotionTheme {
                AppNavigation()
            }
        }
    }
}
