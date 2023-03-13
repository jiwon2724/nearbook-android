package com.jiwondev.nearbook_android.network

import android.view.Display
import com.jiwondev.nearbook_android.BuildConfig
import com.jiwondev.nearbook_android.network.dto.BookResponse
import com.jiwondev.nearbook_android.resource.Constant.Companion.GET_SEARCH_BOOK_LIST
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiInterface {
    @GET(GET_SEARCH_BOOK_LIST)
    suspend fun getSearchBookResponse(
        @Header("X-Naver-Client-Id") id: String = BuildConfig.NAVER_CLIENT_ID,
        @Header("X-Naver-Client-Secret") secret: String = BuildConfig.NAVER_CLIENT_SECRET,
        @Query("query") query: String,
        @Query("display") display: Int = 20,
        @Query("start") start: Int = 1
    ) : Response<BookResponse>
}