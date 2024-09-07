package com.example.domain.usecase

import com.example.domain.repository.JobRepository

class FetchOffersUseCase(private val jobRepository: JobRepository) {
    suspend fun execute() = jobRepository.getOffers()
}
