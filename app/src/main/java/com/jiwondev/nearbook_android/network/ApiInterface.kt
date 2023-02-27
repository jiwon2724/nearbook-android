package com.jiwondev.nearbook_android.network

import android.view.Display
import com.jiwondev.nearbook_android.network.dto.BookResponse
import com.jiwondev.nearbook_android.resource.Constant.Companion.GET_SEARCH_BOOK_LIST
import com.jiwondev.nearbook_android.resource.Constant.Companion.NAVER_CLIENT_ID
import com.jiwondev.nearbook_android.resource.Constant.Companion.NAVER_CLIENT_SECRET
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiInterface {
    @GET(GET_SEARCH_BOOK_LIST)
    fun getSearchResponse(
        @Header("X-Naver-Client-Id") id: String = NAVER_CLIENT_ID,
        @Header("X-Naver-Client-Secret") secret: String = NAVER_CLIENT_SECRET,
        @Query("query") query: String,
        @Query("display") display: Int = 20,
        @Query("start") start: Int
    ) : Response<BookResponse>
}