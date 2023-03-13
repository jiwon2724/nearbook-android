package com.jiwondev.nearbook_android.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.jiwondev.nearbook_android.data.book.datasource.BookDataSource
import com.jiwondev.nearbook_android.data.book.datasource.SearchBookDataSource
import com.jiwondev.nearbook_android.data.book.repository.SearchBookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchBookViewModel @Inject constructor(
    private val searchBookRepository: SearchBookRepository
) : ViewModel() {

}