package com.alif.tmdd_movie.domain.repository

import com.alif.tmdd_movie.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}