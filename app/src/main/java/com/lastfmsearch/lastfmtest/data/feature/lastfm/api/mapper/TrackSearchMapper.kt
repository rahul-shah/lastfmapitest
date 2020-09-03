package com.lastfmsearch.lastfmtest.data.feature.lastfm.api.mapper

import com.lastfmsearch.lastfmtest.common.Mapper
import com.lastfmsearch.lastfmtest.data.feature.lastfm.api.model.TrackSearchSerializer
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Track

object TrackSearchMapper : Mapper<TrackSearchSerializer, List<Track>>() {

    override fun map(input: TrackSearchSerializer): List<Track> {
        return input.results.trackmatches.track.map(TrackMapper::map)
    }
}