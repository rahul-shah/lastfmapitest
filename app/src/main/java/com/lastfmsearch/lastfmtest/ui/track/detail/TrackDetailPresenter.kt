package com.lastfmsearch.lastfmtest.ui.track.detail

import com.lastfmsearch.lastfmtest.common.AppExecutors
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.LastFmRepository
import com.lastfmsearch.lastfmtest.presenter.base.BasePresenter
import com.lastfmsearch.lastfmtest.presenter.base.BaseView
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TrackDetailPresenter(
    private val appExecutors: AppExecutors,
    private val lastFmRepository: LastFmRepository
) : BasePresenter<TrackDetailPresenter.View>(appExecutors) {

    lateinit var trackId: String

    override fun bind(view: View) {
        super.bind(view)
        uiScope.launch {
            withContext(appExecutors.io) {
                // get track
            }
        }
    }

    interface View : BaseView
}