package com.alif.tmdd_movie.data.model.tv


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_popular_tv_shows")
data class TvShow(
    @SerializedName("first_air_date")
    val firstAirDate: String?,

    @PrimaryKey
    @SerializedName("id")
    val id: Int?,

    @SerializedName("name")
    val name: String?,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("poster_path")
    val posterPath: String?,
)