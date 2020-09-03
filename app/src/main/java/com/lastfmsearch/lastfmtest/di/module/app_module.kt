package com.lastfmsearch.lastfmtest.di.module

import com.lastfmsearch.lastfmtest.common.AppExecutors
import com.lastfmsearch.lastfmtest.data.feature.common.preferences.AppPreferencesImpl
import com.lastfmsearch.lastfmtest.domain.feature.common.preferences.AppPreferences
import com.lastfmsearch.lastfmtest.domain.feature.common.preferences.interactor.AddRecentQuery
import com.lastfmsearch.lastfmtest.domain.feature.common.preferences.interactor.RecentQueries
import org.koin.dsl.module
import org.koin.experimental.builder.single
import org.koin.experimental.builder.singleBy

val appModule = module {
    @Suppress("RemoveExplicitTypeArguments")
    single<AppExecutors> { AppExecutors() }


    // Services
    singleBy<AppPreferences, AppPreferencesImpl>()

    // Interactors
    single<AddRecentQuery>()
    single<RecentQueries>()
}