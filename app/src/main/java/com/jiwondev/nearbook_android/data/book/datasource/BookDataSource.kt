package com.jiwondev.nearbook_android.data.book.datasource

import com.jiwondev.nearbook_android.network.dto.Item

interface BookDataSource {
    suspend fun searchBooks(query: String): List<Item>
}
