package com.example.jobsearchapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.domain.usecase.FetchOffersUseCase
import com.example.domain.usecase.FetchVacanciesUseCase
import kotlinx.coroutines.Dispatchers

class JobsViewModel(
    private val fetchOffersUseCase: FetchOffersUseCase,
    private val fetchVacanciesUseCase: FetchVacanciesUseCase
) : ViewModel() {

    val offerData = liveData(Dispatchers.IO) {
        val offers = fetchOffersUseCase.execute()
        emit(offers)
    }

    val vacancyData = liveData(Dispatchers.IO) {
        val vacancies = fetchVacanciesUseCase.execute()
        emit(vacancies)
    }
}