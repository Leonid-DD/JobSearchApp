package com.example.data.local

import android.content.Context
import android.content.SharedPreferences
import com.example.data.model.VacancyNetworkModel
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    context: Context
) : LocalDataSource {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("favourites", Context.MODE_PRIVATE)

    override suspend fun getFavourites(): List<VacancyNetworkModel> {
        TODO("Not yet implemented")
    }

    override fun saveFavourite(jobId: Int) {
        sharedPreferences.edit().putBoolean(jobId.toString(), true).apply()
    }

    override fun isFavourite(jobId: Int): Boolean {
        return sharedPreferences.getBoolean(jobId.toString(), false)
    }
}