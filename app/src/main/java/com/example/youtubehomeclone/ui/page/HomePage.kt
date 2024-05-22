package com.example.youtubehomeclone.ui.page

import android.annotation.SuppressLint
import android.widget.Toolbar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youtubehomeclone.R
import com.example.youtubehomeclone.data.model.VideoSupplier
import com.example.youtubehomeclone.ui.theme.YoutubeHomeCloneTheme
import com.example.youtubehomeclone.ui.widget.HomeCategories
import com.example.youtubehomeclone.ui.widget.HomeShorts
import com.example.youtubehomeclone.ui.widget.HomeToolbar
import com.example.youtubehomeclone.ui.widget.HomeVideo

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomePage() {
    Scaffold {
        Column {
            HomeToolbar(paddingValues = it)
            HomeCategories()
            LazyColumn(
                modifier = Modifier
                    .padding(top = 8.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(bottom = it.calculateBottomPadding()+12.dp)
            ) {
                item {
                    HomeShorts()
                }
                item {
                    Spacer(modifier = Modifier.height(8.dp))
                }
                items(VideoSupplier.videos) { item ->
                    HomeVideo(model = item)
                }
            }
        }
    }
}