package com.example.domain.usecase

import com.example.data.repository.JobRepository

class FetchVacanciesUseCase(private val jobRepository: JobRepository) {
    suspend fun execute() = jobRepository.getVacancies()
}
