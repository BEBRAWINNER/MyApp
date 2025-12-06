package com.example.myapp

import android.app.Application
import com.example.myapp.di.dbModule
import com.example.myapp.di.errorsFeaturesModule
import com.example.myapp.di.mainModule
import com.example.myapp.di.networkModule
import org.koin.android.ext.koin.androidLogger
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(mainModule, errorsFeaturesModule, networkModule, dbModule)
        }
    }
}