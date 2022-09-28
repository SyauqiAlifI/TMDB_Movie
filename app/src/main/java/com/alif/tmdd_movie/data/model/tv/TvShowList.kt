package com.alif.tmdd_movie.data.model.tv


import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("tvShows")
    val tvShows: List<TvShow?>?,
)