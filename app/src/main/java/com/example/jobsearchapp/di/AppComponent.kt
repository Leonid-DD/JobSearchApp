package com.example.jobsearchapp.di

import com.example.jobsearchapp.MainActivity
import com.example.jobsearchapp.presentation.fragments.JobsListFragment
import com.example.jobsearchapp.presentation.fragments.SignInFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class,
        RepositoryModule::class,
        UseCaseModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {

    fun inject(activity:MainActivity)
    fun inject(fragment: SignInFragment)
    fun inject(fragment: JobsListFragment)

}