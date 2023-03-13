package com.jiwondev.nearbook_android.data.book.repository

import com.jiwondev.nearbook_android.data.book.datasource.BookDataSource
import javax.inject.Inject

class SearchBookRepository @Inject constructor(private val searchBookDataSource: BookDataSource) {
    suspend fun searchBooks(query: String) = searchBookDataSource.searchBooks(query)
}