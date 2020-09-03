package com.lastfmsearch.lastfmtest.data.feature.lastfm.api.mapper

import com.lastfmsearch.lastfmtest.common.Mapper
import com.lastfmsearch.lastfmtest.data.feature.lastfm.api.model.ArtistSerializer
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Artist

object ArtistMapper : Mapper<ArtistSerializer, Artist>() {

    override fun map(input: ArtistSerializer): Artist {
        return Artist(
            mbid = input.mbid,
            image = ImageCollectionMapper.map(input.image),
            name = input.name,
            listeners = input.listeners.toIntOrNull() ?: 0,
            url = input.url
        )
    }
}