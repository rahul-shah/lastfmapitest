package com.lastfmsearch.lastfmtest.domain.feature.common.preferences.interactor

import com.lastfmsearch.lastfmtest.domain.feature.common.preferences.AppPreferences
import com.lastfmsearch.lastfmtest.domain.feature.common.preferences.mapper.SearchQueryMapper

class RecentQueries(private val appPreferences: AppPreferences) {

    fun execute(): List<String> {
        return appPreferences.recentQueries
            .map { SearchQueryMapper.map(it).query }
    }

}