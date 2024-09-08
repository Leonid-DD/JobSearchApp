package com.example.jobsearchapp.di

import android.content.Context
import com.example.data.local.LocalDataSource
import com.example.data.local.LocalDataSourceImpl
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
    fun provideLocalDataSource(context: Context): LocalDataSource {
        return LocalDataSourceImpl(context)
    }
}