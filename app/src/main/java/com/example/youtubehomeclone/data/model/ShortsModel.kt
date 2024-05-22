package com.example.youtubehomeclone.data.model

import com.example.youtubehomeclone.utils.extension.randomImage

data class ShortsModel(val title: String, val imageUrl: String, val seeCount: String)


object ShortsSupplier {
    val shortsList = listOf(
        ShortsModel("Shorts 1", 0.randomImage, "4.2M görüntüleme"),
        ShortsModel("Shorts 2", 1.randomImage, "2.3M görüntüleme"),
        ShortsModel("Shorts 3", 2.randomImage, "8.5M görüntüleme"),
        ShortsModel("Shorts 4", 3.randomImage, "1.2M görüntüleme"),
        ShortsModel("Shorts 5", 4.randomImage, "3.7M görüntüleme"),
        ShortsModel("Shorts 6", 5.randomImage, "1.8M görüntüleme"),
        ShortsModel("Shorts 7", 6.randomImage, "4.2M görüntüleme"),
        ShortsModel("Shorts 8", 7.randomImage, "2.3M görüntüleme"),
        ShortsModel("Shorts 9", 8.randomImage, "8.5M görüntüleme"),
        ShortsModel("Shorts 10", 9.randomImage, "1.2M görüntüleme"),
        )
}
