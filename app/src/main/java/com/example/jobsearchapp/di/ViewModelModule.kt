package com.example.jobsearchapp.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jobsearchapp.di.keys.ViewModelKey
import com.example.jobsearchapp.presentation.viewmodel.JobsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

//    @Binds
//    @IntoMap
//    @ViewModelKey(JobsViewModel::class)
//    abstract fun bindJobsViewModel(jobsViewModel: JobsViewModel): ViewModel

    // You can add bindings for other ViewModels here
}