package com.jiwondev.nearbook_android.network.dto

data class BookResponse(
    val display: Int,
    val items: List<Item>,
    val lastBuildDate: String,
    val start: Int,
    val total: Int
)