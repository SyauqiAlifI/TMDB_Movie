package com.alif.tmdd_movie.data.model.artist


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_popular_artists")
data class Artist(
    @PrimaryKey
    @SerializedName("id")
    var id: Int?,

    @SerializedName("name")
    var name: String?,
    @SerializedName("popularity")
    var popularity: Double?,
    @SerializedName("profile_path")
    var profilePath: String?
)