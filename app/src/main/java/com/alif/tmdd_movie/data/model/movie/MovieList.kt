package com.alif.tmdd_movie.data.model.movie


import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("movies")
    var movies: List<Movie?>?,
)