package com.alif.tmdd_movie.domain.usecase.tv

import com.alif.tmdd_movie.data.model.tv.TvShow
import com.alif.tmdd_movie.domain.repository.MovieRepository
import com.alif.tmdd_movie.domain.repository.TvShowRepository

class GetTvShowUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.getTvShows()
}