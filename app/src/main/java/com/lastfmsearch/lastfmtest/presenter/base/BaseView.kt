package com.lastfmsearch.lastfmtest.presenter.base

import androidx.lifecycle.LifecycleOwner

interface BaseView : LifecycleOwner {
    fun showGenericError() = Unit
}