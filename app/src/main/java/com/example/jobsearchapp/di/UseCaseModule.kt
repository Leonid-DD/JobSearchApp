package com.example.jobsearchapp.di

import com.example.domain.repository.JobRepository
import com.example.domain.usecase.FetchOffersUseCase
import com.example.domain.usecase.FetchVacanciesUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideFetchOffersUseCase(jobRepository: JobRepository): FetchOffersUseCase {
        return FetchOffersUseCase(jobRepository)
    }

    @Provides
    fun provideFetchVacanciesUseCase(jobRepository: JobRepository): FetchVacanciesUseCase {
        return FetchVacanciesUseCase(jobRepository)
    }

//    @Provides
//    fun provideManageFavouritesUseCase(jobRepository: JobRepository): ManageFavouritesUseCase {
//        return ManageFavouritesUseCase(jobRepository)
//    }
}