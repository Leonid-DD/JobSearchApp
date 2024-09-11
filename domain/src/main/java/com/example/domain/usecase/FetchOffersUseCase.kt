package com.example.domain.usecase

import com.example.data.repository.JobRepository

class FetchOffersUseCase(private val jobRepository: JobRepository) {
    suspend fun execute() = jobRepository.getOffers()
}
