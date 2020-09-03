package com.lastfmsearch.lastfmtest.common.extensions.lastfm.model

import com.lastfmsearch.lastfmtest.domain.feature.lastfm.model.MusicSearch

fun MusicSearch.isEmpty() = tracks.isEmpty() && artists.isEmpty() && albums.isEmpty()