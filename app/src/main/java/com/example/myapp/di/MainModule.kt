package com.example.myapp.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile
import com.example.myapp.Errors
import com.example.myapp.errors.data.mapper.ErrorsResponseToEntityMapper
import com.example.myapp.errors.data.model.ErrorsApi
import com.example.myapp.errors.data.repository.ErrorsRepository
import com.example.myapp.errors.domain.interactor.ErrorsInteractor
import com.example.myapp.errors.presentation.viewModel.ErrorsDetailsViewModel
import com.example.myapp.errors.presentation.viewModel.ErrorsListViewModel
import com.example.myapp.navigation.TopLevelBackStack
import com.example.myapp.navigation.Route
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val mainModule = module {
    single { TopLevelBackStack<Route>(Errors) }

    single {
        getDataStore(androidContext())
    }
}

fun getDataStore(androidContext: Context): DataStore<Preferences> =
    PreferenceDataStoreFactory.create {
        androidContext.preferencesDataStoreFile("default")
    }