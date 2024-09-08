package com.example.data.local

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(context: Context) : LocalDataSource {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("favourites", Context.MODE_PRIVATE)

    override fun saveFavourite(jobId: Int) {
        sharedPreferences.edit().putBoolean(jobId.toString(), true).apply()
    }

    override fun isFavourite(jobId: Int): Boolean {
        return sharedPreferences.getBoolean(jobId.toString(), false)
    }
}