package com.jiwondev.nearbook_android.data.book.datasource

import android.util.Log
import com.jiwondev.nearbook_android.network.ApiInterface
import com.jiwondev.nearbook_android.network.dto.BookResponse
import com.jiwondev.nearbook_android.network.dto.Item
import javax.inject.Inject

class BookDataSourceImpl @Inject constructor(private val api: ApiInterface) : BookDataSource {
    override suspend fun searchBooks(query: String): List<Item> {
        val response = api.getSearchBookResponse(query = query)
        return if(response.isSuccessful) {
            response.body()?.items ?: emptyList()
        } else {
            emptyList()
        }
    }
}