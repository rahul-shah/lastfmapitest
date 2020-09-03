package com.lastfmsearch.lastfmtest.ui.home

import com.bumptech.glide.Glide
import com.lastfmsearch.lastfmtest.R
import com.lastfmsearch.lastfmtest.common.extensions.lastfm.model.defaultImageUrl
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Track
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.track_search_item.*

class TrackItem(private val track: Track) : Item() {

    override fun getLayout() = R.layout.track_search_item

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.track.text = track.name
        viewHolder.artist.text = track.artist

        Glide.with(viewHolder.root)
            .load(track.defaultImageUrl())
            .into(viewHolder.image)
    }

}