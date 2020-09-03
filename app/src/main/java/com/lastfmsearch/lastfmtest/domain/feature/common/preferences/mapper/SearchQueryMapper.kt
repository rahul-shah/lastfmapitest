package com.lastfmsearch.lastfmtest.domain.feature.common.preferences.mapper

import com.lastfmsearch.lastfmtest.common.ReversibleMapper
import com.lastfmsearch.lastfmtest.domain.feature.common.preferences.model.SearchQuery

object SearchQueryMapper : ReversibleMapper<String, SearchQuery>() {

    override fun map(input: String): SearchQuery {
        return SearchQuery(
            query = input.substring(0, input.lastIndexOf(":")),
            date = input.substring(input.lastIndexOf(":") + 1, input.length).toLong()
        )
    }

    override fun reverseMap(output: SearchQuery): String {
        return "${output.query}:${output.date}"
    }
}