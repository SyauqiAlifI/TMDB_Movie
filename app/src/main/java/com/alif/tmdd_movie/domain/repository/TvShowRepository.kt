package com.alif.tmdd_movie.domain.repository

import com.alif.tmdd_movie.data.model.tv.TvShow

interface TvShowRepository {
    suspend fun getTvShows(): List<TvShow>?
    suspend fun updateTvShows(): List<TvShow>?
}