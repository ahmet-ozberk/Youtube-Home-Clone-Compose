package com.example.youtubehomeclone.utils.extension

val Int.randomImage: String
    get() = "https://loremflickr.com/1080/720?random=${this}"

val Int.randomPersonImage: String
    get() = "https://loremflickr.com/1080/720/person?random=${this}"