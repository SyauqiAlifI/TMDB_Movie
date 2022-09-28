package com.alif.tmdd_movie.data.model.artist


import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("artists")
    var artists: List<Artist?>?,
)