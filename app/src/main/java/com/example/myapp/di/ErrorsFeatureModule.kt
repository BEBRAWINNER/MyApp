package com.example.myapp.di

import com.example.myapp.errors.data.mapper.ErrorsResponseToEntityMapper
import com.example.myapp.errors.data.model.ErrorsApi
import com.example.myapp.errors.data.repository.ErrorsRepository
import com.example.myapp.errors.domain.interactor.ErrorsInteractor
import com.example.myapp.errors.presentation.viewModel.ErrorsDetailsViewModel
import com.example.myapp.errors.presentation.viewModel.ErrorsListViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val errorsFeaturesModule = module {
    viewModel { ErrorsDetailsViewModel(get(), get()) }
    viewModel { ErrorsListViewModel(get(), get()) }

    single {get<Retrofit>().create(ErrorsApi::class.java)}

    factory { ErrorsResponseToEntityMapper() }
    single { ErrorsRepository(get(), get()) }

    single { ErrorsInteractor(get()) }
}