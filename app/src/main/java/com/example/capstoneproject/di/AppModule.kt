package com.example.capstoneproject.di

import com.example.capstoneproject.core.domain.usecase.TeamInteractor
import com.example.capstoneproject.core.domain.usecase.TeamUseCase
import com.example.capstoneproject.ui.detail.DetailViewModel
import com.example.capstoneproject.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<TeamUseCase> { TeamInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}