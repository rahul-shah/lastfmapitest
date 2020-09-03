package com.lastfmsearch.lastfmtest.common

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

open class AppExecutors(
    val io: CoroutineContext = Dispatchers.Default,
    val ui: CoroutineContext = Dispatchers.Main
)