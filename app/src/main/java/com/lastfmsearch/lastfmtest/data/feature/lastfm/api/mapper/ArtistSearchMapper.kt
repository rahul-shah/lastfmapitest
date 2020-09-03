package com.lastfmsearch.lastfmtest.data.feature.lastfm.api.mapper

import com.lastfmsearch.lastfmtest.common.Mapper
import com.lastfmsearch.lastfmtest.data.feature.lastfm.api.model.ArtistSearchSerializer
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Artist

object ArtistSearchMapper : Mapper<ArtistSearchSerializer, List<Artist>>() {

    override fun map(input: ArtistSearchSerializer): List<Artist> {
        return input.results.artistmatches.artist.map(ArtistMapper::map)
    }
}