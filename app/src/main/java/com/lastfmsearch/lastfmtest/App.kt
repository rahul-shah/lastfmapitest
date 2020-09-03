package com.lastfmsearch.lastfmtest

import android.app.Application
import com.lastfmsearch.lastfmtest.di.module.appModule
import com.lastfmsearch.lastfmtest.di.module.feature.lastfm.lastFmModule
import com.lastfmsearch.lastfmtest.di.module.ui.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)

            modules(
                appModule,
                lastFmModule,
                uiModule
            )
        }

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}