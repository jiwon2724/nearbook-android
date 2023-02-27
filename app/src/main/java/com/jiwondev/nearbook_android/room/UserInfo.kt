package com.jiwondev.nearbook_android.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "nearbook_table")
data class UserInfo(
    @PrimaryKey  val nickname: String
)
