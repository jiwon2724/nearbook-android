package com.jiwondev.nearbook_android.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.jiwondev.nearbook_android.room.entities.UserInfo

@Dao
interface UserInfoDao {
    @Query("SELECT * FROM nearbook_table")
    suspend fun gentUserInfo(): UserInfo?

    @Insert
    suspend fun insertNickname(nickname: UserInfo)
}