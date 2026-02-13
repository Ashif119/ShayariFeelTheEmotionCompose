package com.itandcstech.shayarifeeltheemotion.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.itandcstech.shayarifeeltheemotion.R
import com.itandcstech.shayarifeeltheemotion.models.OnBoardingPage
import kotlinx.coroutines.launch


/**
 * @Created by Ashif on 12-02-2026
 * Know more about author at https://ashif.nexmerce.in
 */
@Composable
fun OnBoardingScreen(onFinished: () -> Unit) {
    val pages = listOf(
        OnBoardingPage(
            "Feel the Emotion",
            "Express your heart with the best collection of Hindi & Urdu Shayari.",
            R.drawable.onboarding1,
            // Gradient for Page 1: Purple/Pink tones
            listOf(Color(0xFF2D2F45), Color(0xFF6B4D6E))
        ),
        OnBoardingPage(
            "Daily Inspiration",
            "Get new quotes and thoughts every day to keep your spirits high.",
            R.drawable.onboarding2,
            // Gradient for Page 2: Deep Blue/Teal tones
            listOf(Color(0xFF2C4A5A), Color(0xFF4B7B8F))
        ),
        OnBoardingPage(
            "Share with Ease",
            "Copy or share your favorite Shayari directly to WhatsApp and Instagram.",
            R.drawable.onboarding3,
            // Gradient for Page 3: Green/Forest tones
            listOf(Color(0xFF3B5B4F), Color(0xFF5E8B7A))
        )
    )

    val pagerState = rememberPagerState(pageCount = { pages.size })
    val scope = rememberCoroutineScope()

    // We select the gradient based on the current page
    val currentGradient = pages[pagerState.currentPage].gradientColors

    Box(
        modifier = Modifier
            .fillMaxSize()
            // Applying Vertical Gradient
            .background(
                brush = Brush.verticalGradient(
                    colors = currentGradient
                )
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // App Title at the top center as seen in your image
            Text(
                text = "ShayariFeelTheEmotion",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 48.dp),
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light
            )

            // Pager for Slides
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.weight(1f)
            ) { position ->
                val page = pages[position]
                OnBoardingPageContent(page)
            }

            // Bottom Section (Dots & Button)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp, vertical = 40.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Skip Button
                Box(
                    modifier = Modifier
                        .padding(16.dp),
                ) {
                    TextButton(onClick = onFinished) {
                        Text("Skip", color = Color.White.copy(alpha = 0.7f))
                    }
                }

                // Pager Indicator (Dots)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    repeat(pages.size) { iteration ->
                        val isSelected = pagerState.currentPage == iteration
                        Box(
                            modifier = Modifier
                                .padding(4.dp)
                                .clip(CircleShape)
                                .background(if (isSelected) Color.White else Color.White.copy(alpha = 0.3f))
                                .size(if (isSelected) 12.dp else 8.dp) // Selected dot is slightly larger
                        )
                    }
                }

                // Next Button
                Button(
                    onClick = {
                        if (pagerState.currentPage == pages.size - 1) {
                            onFinished()
                        } else {
                            scope.launch {
                                pagerState.animateScrollToPage(pagerState.currentPage + 1)
                            }
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = if (pagerState.currentPage == pages.size - 1) "Get Started" else "Next",
                        color = currentGradient[0] // Text color matches the theme
                    )
                }
            }
        }
    }
}

@Composable
fun OnBoardingPageContent(page: OnBoardingPage) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = page.image),
            contentDescription = null,
            modifier = Modifier.size(280.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = page.title,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = page.description,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            color = Color.White.copy(alpha = 0.8f)
        )
    }
}