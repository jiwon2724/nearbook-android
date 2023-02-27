package com.jiwondev.nearbook_android.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserInfoDao {
    @Query("SELECT * FROM nearbook_table")
    suspend fun gentUserInfo(): UserInfo?

    @Insert
    suspend fun insertNickname(nickname: UserInfo)
}