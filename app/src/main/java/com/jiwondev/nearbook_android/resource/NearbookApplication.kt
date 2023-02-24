package com.jiwondev.nearbook_android.resource

import android.app.Application
import com.jiwondev.nearbook_android.room.NearbookRoomDatabase

class NearbookApplication : Application() {
    val database by lazy { NearbookRoomDatabase.getDatabase(this) }
}