package com.example.myapp.di

import com.example.myapp.Errors
import com.example.myapp.errors.presentation.viewModel.ErrorsDetailsViewModel
import com.example.myapp.navigation.TopLevelBackStack
import com.example.myapp.navigation.Route
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    single { TopLevelBackStack<Route>(Errors) }

    viewModel { ErrorsDetailsViewModel(get(), get()) }
}