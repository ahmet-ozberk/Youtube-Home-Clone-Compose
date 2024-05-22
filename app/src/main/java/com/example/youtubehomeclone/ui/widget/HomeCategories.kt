package com.example.youtubehomeclone.ui.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.youtubehomeclone.data.model.CategoriesSupplier
import com.example.youtubehomeclone.ui.page.HomePage
import com.example.youtubehomeclone.ui.theme.Black
import com.example.youtubehomeclone.ui.theme.LightGrey
import com.example.youtubehomeclone.ui.theme.YoutubeHomeCloneTheme

@Composable
fun HomeCategories() {
    var categories by remember {
        mutableStateOf(CategoriesSupplier.categories.toList())
    }

    fun selectCategory(index: Int) {
        categories = categories.mapIndexed { i, item ->
            item.copy(isSelect = i == index)
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)

        ) {
            categories.forEachIndexed { index, item ->
                item {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(if (item.isSelect) Black else LightGrey)
                            .clickable {
                                selectCategory(index)
                            }
                    ) {
                        Text(
                            text = item.name,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                            color = if (item.isSelect) Color.White else Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}