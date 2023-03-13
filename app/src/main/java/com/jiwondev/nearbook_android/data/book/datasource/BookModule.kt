package com.jiwondev.nearbook_android.data.book.datasource

import androidx.fragment.app.Fragment
import com.jiwondev.nearbook_android.network.ApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object BookModule {
    @Provides
    fun provideBookDataSource(api: ApiInterface): BookDataSource = BookDataSourceImpl(api)
}