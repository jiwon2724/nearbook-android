package com.jiwondev.nearbook_android.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jiwondev.nearbook_android.room.entities.UserInfo

@Database(entities = [UserInfo::class], version = 1, exportSchema = false)
abstract class NearbookRoomDatabase : RoomDatabase() {
    abstract fun userInfoDao(): UserInfoDao

    companion object {
        @Volatile
        private var INSTANCE: NearbookRoomDatabase? = null

        fun getDatabase(context: Context) : NearbookRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NearbookRoomDatabase::class.java,
                    "nearbook_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}