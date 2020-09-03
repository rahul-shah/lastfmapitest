package com.lastfmsearch.lastfmtest.data.feature.lastfm.api.mapper

import com.lastfmsearch.lastfmtest.common.Mapper
import com.lastfmsearch.lastfmtest.data.feature.lastfm.api.model.TrackSerializer
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Track

object TrackMapper : Mapper<TrackSerializer, Track>() {

    override fun map(input: TrackSerializer): Track {
        return Track(
            mbid = input.mbid,
            image = ImageCollectionMapper.map(input.image),
            name = input.name,
            artist = input.artist,
            url = input.url
        )
    }
}