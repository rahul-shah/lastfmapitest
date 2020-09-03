package com.lastfmsearch.lastfmtest.ui.track.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lastfmsearch.lastfmtest.R
import org.koin.android.ext.android.inject

class TrackDetailFragment : Fragment(), TrackDetailPresenter.View {


    companion object {
        const val EXTRA_TRACK_ID = "track_id"
    }

    private val presenter by inject<TrackDetailPresenter>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.track_detail, container, false).also {
            presenter.trackId = arguments!!.getString(EXTRA_TRACK_ID)
            presenter.bind(this)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.unbind()
    }

}