@file:Suppress("SpellCheckingInspection")

package com.lastfmsearch.lastfmtest.data.feature.lastfm.api.model

data class ArtistSearchSerializer(val results: Results) {
    data class Results(val artistmatches: ArtistMatches) {
        data class ArtistMatches(val artist: List<ArtistSerializer>)
    }
}