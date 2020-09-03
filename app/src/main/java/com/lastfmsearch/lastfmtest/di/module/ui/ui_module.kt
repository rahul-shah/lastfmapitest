package com.lastfmsearch.lastfmtest.di.module.ui

import com.lastfmsearch.lastfmtest.presentation.home.HomePresenter
import com.lastfmsearch.lastfmtest.ui.track.detail.TrackDetailPresenter
import org.koin.dsl.module
import org.koin.experimental.builder.factory

val uiModule = module {
    factory<HomePresenter>()
    factory<TrackDetailPresenter>()
}