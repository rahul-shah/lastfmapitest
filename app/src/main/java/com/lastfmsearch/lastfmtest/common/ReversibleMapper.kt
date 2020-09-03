package com.lastfmsearch.lastfmtest.common

abstract class ReversibleMapper<Input, Output> : Mapper<Input, Output>() {

    abstract fun reverseMap(output: Output) : Input

}