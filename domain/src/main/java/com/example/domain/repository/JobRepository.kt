package com.example.domain.repository

import com.example.data.model.OfferNetworkModel
import com.example.data.model.VacancyNetworkModel

interface JobRepository {
    suspend fun getOffers(): List<OfferNetworkModel>
    suspend fun getVacancies(): List<VacancyNetworkModel>
}
