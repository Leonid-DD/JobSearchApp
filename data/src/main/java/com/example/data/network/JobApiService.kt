package com.example.data.network

import com.example.data.model.JobOffersNetworkModel
import com.example.data.model.OfferNetworkModel
import com.example.data.model.VacancyNetworkModel
import retrofit2.http.GET

interface JobApiService {

    @GET("path_to_your_offers_json")
    suspend fun getJobsData(): JobOffersNetworkModel

}