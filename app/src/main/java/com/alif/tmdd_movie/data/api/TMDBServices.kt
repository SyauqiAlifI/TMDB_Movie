package com.alif.tmdd_movie.data.api

import com.alif.tmdd_movie.data.model.artist.ArtistList
import com.alif.tmdd_movie.data.model.movie.MovieList
import com.alif.tmdd_movie.data.model.tv.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBServices {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")
        apiKey : String,
    ): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(
        @Query("api_key")
        apiKey : String,
    ): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(
        @Query("api_key")
        apiKey : String,
    ): Response<ArtistList>
}