package com.lastfmsearch.lastfmtest.data.feature.lastfm.api.mapper

import com.lastfmsearch.lastfmtest.common.Mapper
import com.lastfmsearch.lastfmtest.data.feature.lastfm.api.model.AlbumSearchSerializer
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Album

object AlbumSearchMapper : Mapper<AlbumSearchSerializer, List<Album>>() {

    override fun map(input: AlbumSearchSerializer): List<Album> {
        return input.results.albummatches.album.map(AlbumMapper::map)
    }
}