package com.example.jobsearchapp

import android.app.Application
import com.example.jobsearchapp.di.AppComponent

class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        // Initialize the Dagger AppComponent
        appComponent = DaggerAppComponent.builder().build()
    }
}
