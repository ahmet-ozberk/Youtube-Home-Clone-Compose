package com.example.youtubehomeclone.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.youtubehomeclone.R
import com.example.youtubehomeclone.data.model.ShortsSupplier
import com.example.youtubehomeclone.ui.page.HomePage
import com.example.youtubehomeclone.ui.theme.LightGrey
import com.example.youtubehomeclone.ui.theme.YoutubeHomeCloneTheme


@Composable
fun HomeShorts() {
    val screenHeight = with(LocalConfiguration.current) { screenHeightDp }
    val screenWidth = with(LocalConfiguration.current) { screenWidthDp }
    Column {
        Row(
            modifier = Modifier.padding(start = 16.dp, top = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.youtube_short_icon),
                contentDescription = "shortsIcon",
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(text = "Shorts", fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .height((screenHeight * 0.3).dp),
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(ShortsSupplier.shortsList) { short ->
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .width((screenWidth * 0.4).dp)
                        .background(LightGrey)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(short.imageUrl)
                            .crossfade(true).build(),
                        contentDescription = null,
                        modifier = Modifier.fillMaxHeight(),
                        contentScale = ContentScale.Crop
                    )
                    IconButton(onClick = { }, modifier = Modifier.align(Alignment.TopEnd)) {
                        Image(
                            painter = painterResource(id = R.drawable.more_icon),
                            contentDescription = "more",
                            modifier = Modifier.size(24.dp),
                        )
                    }
                    Column(
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(8.dp)
                    ) {
                        Text(
                            text = (short.title),
                            fontSize = 14.sp,
                            maxLines = 2,
                            color = Color.White,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = short.seeCount, fontSize = 12.sp, maxLines = 1, color = LightGrey
                        )
                    }
                }
            }
        }
    }
}