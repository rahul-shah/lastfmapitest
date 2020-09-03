package com.lastfmsearch.lastfmtest.data.feature.lastfm.api.mapper

import com.lastfmsearch.lastfmtest.common.Mapper
import com.lastfmsearch.lastfmtest.data.feature.lastfm.api.model.AlbumSerializer
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Album

object AlbumMapper : Mapper<AlbumSerializer, Album>() {

    override fun map(input: AlbumSerializer): Album {
        return Album(
            mbid = input.mbid,
            image = ImageCollectionMapper.map(input.image),
            name = input.name,
            artist = input.artist,
            url = input.url
        )
    }
}