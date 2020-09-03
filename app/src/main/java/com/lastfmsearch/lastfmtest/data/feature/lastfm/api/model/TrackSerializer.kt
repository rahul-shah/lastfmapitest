package com.lastfmsearch.lastfmtest.data.feature.lastfm.api.model

data class TrackSerializer(
    val mbid: String,
    val name: String,
    val artist: String,
    val url: String,
    val image: List<ImageSerializer>
)