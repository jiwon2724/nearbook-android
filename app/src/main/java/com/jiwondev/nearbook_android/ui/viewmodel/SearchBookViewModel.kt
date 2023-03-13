package com.jiwondev.nearbook_android.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jiwondev.nearbook_android.data.book.repository.SearchBookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchBookViewModel @Inject constructor(
    private val searchBookRepository: SearchBookRepository
) : ViewModel() {
    fun test(query: String) = viewModelScope.launch {
        val result = searchBookRepository.searchBooks(query)
        Log.d("result!! : ", result.toString())
    }
}


