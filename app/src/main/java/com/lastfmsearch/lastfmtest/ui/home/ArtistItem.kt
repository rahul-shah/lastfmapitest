package com.lastfmsearch.lastfmtest.ui.home

import com.bumptech.glide.Glide
import com.lastfmsearch.lastfmtest.R
import com.lastfmsearch.lastfmtest.common.extensions.lastfm.model.defaultImageUrl
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Artist
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.artist_search_item.*

class ArtistItem(private val artist: Artist) : Item() {

    override fun getLayout() = R.layout.artist_search_item

    override fun bind(viewHolder: ViewHolder, position: Int) {
        val context = viewHolder.root.context

        viewHolder.listeners.text = context.getString(R.string.artist_listeners, artist.listeners)
        viewHolder.artist.text = artist.name

        Glide.with(viewHolder.root)
            .load(artist.defaultImageUrl())
            .into(viewHolder.image)
    }

}