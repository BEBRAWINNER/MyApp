package com.example.myapp.errors.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapp.errors.data.ErrorsDao
import com.example.myapp.errors.data.entity.ErrorsDbEntity

@Database(entities = [ErrorsDbEntity::class], version = 1)
abstract class ErrorsDatabase: RoomDatabase() {
    abstract fun errorsDao(): ErrorsDao
}