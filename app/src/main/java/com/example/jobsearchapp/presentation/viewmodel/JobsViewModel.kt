package com.example.jobsearchapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.data.model.OfferNetworkModel
import com.example.data.model.VacancyNetworkModel
import com.example.domain.usecase.FetchOffersUseCase
import com.example.domain.usecase.FetchVacanciesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class JobsViewModel(
    private val fetchOffersUseCase: FetchOffersUseCase,
    private val fetchVacanciesUseCase: FetchVacanciesUseCase
) : ViewModel() {

    private val _offers = MutableLiveData<List<OfferNetworkModel>>()
    val offers: LiveData<List<OfferNetworkModel>> get() = _offers

    private val _vacancies = MutableLiveData<List<VacancyNetworkModel>>()
    val vacancies: LiveData<List<VacancyNetworkModel>> get() = _vacancies

    fun loadOffers() {
        viewModelScope.launch {
            _offers.value = fetchOffersUseCase.execute()
        }
    }

    fun loadVacancies() {
        viewModelScope.launch {
            _vacancies.value = fetchVacanciesUseCase.execute()
        }
    }
}