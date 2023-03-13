package com.jiwondev.nearbook_android.data.book.repository

import com.jiwondev.nearbook_android.data.book.datasource.SearchBookDataSource
import javax.inject.Inject

class SearchBookRepository @Inject constructor(private val searchBookDataSource: SearchBookDataSource) {
}