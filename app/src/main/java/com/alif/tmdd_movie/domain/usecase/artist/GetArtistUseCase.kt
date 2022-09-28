package com.alif.tmdd_movie.domain.usecase.artist

import com.alif.tmdd_movie.data.model.artist.Artist
import com.alif.tmdd_movie.domain.repository.ArtistRepository

class GetArtistUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.getArtists()
}