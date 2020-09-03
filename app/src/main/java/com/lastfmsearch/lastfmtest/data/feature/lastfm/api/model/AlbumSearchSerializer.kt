@file:Suppress("SpellCheckingInspection")

package com.lastfmsearch.lastfmtest.data.feature.lastfm.api.model

data class AlbumSearchSerializer(val results: Results) {
    data class Results(val albummatches: AlbumMatches) {
        data class AlbumMatches(val album: List<AlbumSerializer>)
    }
}