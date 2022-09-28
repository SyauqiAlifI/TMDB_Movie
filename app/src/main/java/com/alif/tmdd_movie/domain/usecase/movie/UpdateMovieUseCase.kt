package com.alif.tmdd_movie.domain.usecase.movie

import com.alif.tmdd_movie.data.model.movie.Movie
import com.alif.tmdd_movie.domain.repository.MovieRepository

class UpdateMovieUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}