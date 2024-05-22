package com.example.youtubehomeclone.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youtubehomeclone.R

@Composable
fun HomeToolbar(paddingValues: PaddingValues){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = paddingValues.calculateTopPadding() + 16.dp,
                start = 8.dp,
                end = 8.dp,
                bottom = 8.dp
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.youtube),
            contentDescription = "youtubeLogo",
            modifier = Modifier.size(24.dp),
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = "Premium", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.weight(1f))

        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.screen_share_icon),
                contentDescription = "shareIcon"
            )
        }
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.notification_icon),
                contentDescription = "shareIcon"
            )
        }
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "shareIcon"
            )
        }
    }
}