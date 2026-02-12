package com.itandcstech.shayarifeeltheemotion.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.itandcstech.shayarifeeltheemotion.commons.getList
import com.itandcstech.shayarifeeltheemotion.routes.Destinations
import com.itandcstech.shayarifeeltheemotion.ui.composables.BackButton

/**
 * @Created by Ashif on 11-02-2026
 * Know more about author at https://ashif.nexmerce.in
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShayariListScreen(mainNavController: NavHostController, title: String = "Shayari Screen") {
    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary,
                titleContentColor = MaterialTheme.colorScheme.onPrimary,
                navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
            ),
            title = {
                Text(title)
            },
            navigationIcon = { BackButton(color = Color.White) }
        )
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.primary)
        ) {
            val shayariList =getList().filter {
                it.title == title
            }
            val finalList = shayariList[0]
            finalList.list?.let {list->
                LazyColumn() {
                    items(list) { it ->
                        Card(modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .clickable{
                                mainNavController.navigate(Destinations.ShayariScreen.route+"/${title}"+"/${it}")
                            },
                            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primaryContainer),
                            shape = RoundedCornerShape(20.dp)
                        ) {
                            Text(
                                modifier = Modifier.padding(12.dp),
                                text = it.toString(),
                                style = MaterialTheme.typography.titleMedium
                            )
                        }

                    }
                }
            }

        }

    }
}

