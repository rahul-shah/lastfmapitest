package com.lastfmsearch.lastfmtest.di.module.feature.lastfm

import com.lastfmsearch.lastfmtest.BuildConfig
import com.lastfmsearch.lastfmtest.R
import com.lastfmsearch.lastfmtest.data.feature.lastfm.LastFmRepositoryImpl
import com.lastfmsearch.lastfmtest.data.feature.lastfm.api.LastFmApiImpl
import com.lastfmsearch.lastfmtest.data.feature.lastfm.api.interceptor.ApiKeyInterceptor
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.LastFmRepository
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.api.LastFmApi
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.koin.experimental.builder.singleBy

val lastFmModule = module {
    single(named("api-url")) {
        androidContext().getString(R.string.lastfm_api_url)
    }

    single {
        ApiKeyInterceptor(BuildConfig.LASTFM_API_KEY)
    }

    single<LastFmApi> {
        LastFmApiImpl(
            apiUrl = get(named("api-url")),
            apiKeyInterceptor = get()
        )
    }

    // Repositories
    singleBy<LastFmRepository, LastFmRepositoryImpl>()
}