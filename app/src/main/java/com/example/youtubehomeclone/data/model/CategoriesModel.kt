package com.example.youtubehomeclone.data.model

data class CategoriesModel(var name: String, var isSelect: Boolean)

object CategoriesSupplier {
    val categories = mutableListOf(
        CategoriesModel("Home", true),
        CategoriesModel("Trending", false),
        CategoriesModel("Subscriptions", false),
        CategoriesModel("Library", false),
        CategoriesModel("History", false),
        CategoriesModel("Your videos", false),
        CategoriesModel("Watch later", false),
        CategoriesModel("Liked videos", false),
        CategoriesModel("Show more", false)
    )
}