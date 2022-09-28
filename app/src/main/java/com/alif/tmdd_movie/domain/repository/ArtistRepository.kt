package com.alif.tmdd_movie.domain.repository

import com.alif.tmdd_movie.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists(): List<Artist>?
    suspend fun updateArtists(): List<Artist>?
}