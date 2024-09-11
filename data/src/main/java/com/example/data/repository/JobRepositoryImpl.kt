package com.example.data.repository

import com.example.data.network.JobApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class JobRepositoryImpl @Inject constructor(
    private val jobApiService: JobApiService
) : JobRepository {

    override suspend fun getOffers() = withContext(Dispatchers.IO) {
        jobApiService.getJobsData().offers
    }

    override suspend fun getVacancies() = withContext(Dispatchers.IO) {
        jobApiService.getJobsData().vacancies
    }
}