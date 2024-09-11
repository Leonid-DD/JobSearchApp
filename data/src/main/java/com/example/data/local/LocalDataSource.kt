package com.example.data.local

import com.example.data.model.VacancyNetworkModel

interface LocalDataSource {
    suspend fun getFavourites(): List<VacancyNetworkModel>
    fun saveFavourite(jobId: Int)
    fun isFavourite(jobId: Int): Boolean
}