package com.jiwondev.nearbook_android.resource

import android.app.Application
import com.jiwondev.nearbook_android.room.NearbookRoomDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NearbookApplication : Application() {
    val database by lazy { NearbookRoomDatabase.getDatabase(this) }
}