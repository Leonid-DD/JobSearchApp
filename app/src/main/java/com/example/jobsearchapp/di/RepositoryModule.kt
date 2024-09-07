package com.example.jobsearchapp.di

import com.example.data.network.JobApiService
import com.example.data.repository.JobRepositoryImpl
import com.example.domain.repository.JobRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideJobRepository(jobApiService: JobApiService): JobRepository {
        return JobRepositoryImpl(jobApiService)
    }

    @Provides
    @Singleton
    fun provideLocalDataSource(): LocalDataSource {
        return LocalDataSourceImpl()  // Local cache (can be Room, SharedPreferences)
    }
}