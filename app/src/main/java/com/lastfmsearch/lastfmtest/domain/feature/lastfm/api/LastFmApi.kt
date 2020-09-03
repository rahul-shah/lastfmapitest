package com.lastfmsearch.lastfmtest.domain.feature.lastfm.api

import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Album
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Artist
import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.Track

interface LastFmApi {
    fun searchTracks(query: String): List<Track>
    fun searchArtists(query: String): List<Artist>
    fun searchAlbums(query: String): List<Album>
}