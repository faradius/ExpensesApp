package org.developerscracks

import android.app.Application
import di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            // declare used Android context
            androidContext(this@MainApplication)
            androidLogger()
            modules(appModule())
        }
    }
}