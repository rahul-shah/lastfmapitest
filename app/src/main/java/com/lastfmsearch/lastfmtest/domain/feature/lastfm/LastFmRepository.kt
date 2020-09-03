package com.lastfmsearch.lastfmtest.domain.feature.lastfm

import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.MusicSearch

interface LastFmRepository {
    suspend fun searchMusic(query: String): MusicSearch
}