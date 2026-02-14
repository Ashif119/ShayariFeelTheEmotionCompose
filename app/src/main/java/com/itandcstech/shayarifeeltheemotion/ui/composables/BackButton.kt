package com.itandcstech.shayarifeeltheemotion.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.itandcstech.shayarifeeltheemotion.R
import com.itandcstech.shayarifeeltheemotion.ui.theme.onPrimaryDark

/**
 * @Created by Ashif on 11-02-2026
 * Know more about author at https://ashif.nexmerce.in
 */
@Preview(showBackground = true)
@Composable
fun BackButton(
    mainNavController: NavHostController?=null,
    color: Color? = null,
    modifier: Modifier = Modifier,
    onBackPressed: (() -> Unit)? = null
) {
    IconButton(modifier = modifier, onClick = {
        onBackPressed?.invoke()
        mainNavController?.popBackStack()
    }) {
        Card(
            modifier = Modifier.size(45.dp),
            colors = CardDefaults.cardColors(onPrimaryDark),
            shape = RoundedCornerShape(200.dp)
        ) {
            Icon(
                modifier = Modifier.padding(10.dp),
                painter = painterResource(id = R.drawable.back),
                contentDescription = "Back button",
                tint = (color ?: LocalContentColor.current) as Color
            )
        }
    }
}