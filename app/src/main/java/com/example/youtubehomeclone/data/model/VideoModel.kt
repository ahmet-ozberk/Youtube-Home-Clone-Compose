package com.example.youtubehomeclone.data.model

import com.example.youtubehomeclone.utils.extension.randomImage
import com.example.youtubehomeclone.utils.extension.randomPersonImage

data class VideoModel(
    val name: String,
    var videoImageUrl: String,
    val personImageUrl: String,
    var personName: String,
    val seeCount: String,
    val time: String,
    val videoTime: String
)

object VideoSupplier {
    val videos = listOf(
        VideoModel(
            "How to make a good coffee",
            0.randomImage,
            0.randomPersonImage,
            "John Doe",
            "1.2M views",
            "2 days ago",
            "10:00"
        ),
        VideoModel(
            "Big Buck Bunny",
            1.randomImage,
            1.randomPersonImage,
            "Alex",
            "4.2M views",
            "20 days ago",
            "20:53"
        ),
        VideoModel(
            "Flutter Dersleri",
            2.randomImage,
            2.randomPersonImage,
            "Brad Flex",
            "8.1M views",
            "3 months ago",
            "16:20"
        ),
        VideoModel(
            "How to make a good coffee",
            3.randomImage,
            3.randomPersonImage,
            "John Doe",
            "1.2M views",
            "2 days ago",
            "10:00"
        ),
        VideoModel(
            "Big Buck Bunny",
            4.randomImage,
            4.randomPersonImage,
            "Alex",
            "4.2M views",
            "20 days ago",
            "20:53"
        ),
        VideoModel(
            "Flutter Dersleri",
            5.randomImage,
            5.randomPersonImage,
            "Brad Flex",
            "8.1M views",
            "3 months ago",
            "16:20"
        ),
    )
}
