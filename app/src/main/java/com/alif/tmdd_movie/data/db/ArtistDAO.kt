package com.alif.tmdd_movie.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.alif.tmdd_movie.data.model.artist.Artist

@Dao
interface ArtistDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveArtists(artists: List<Artist>)

    @Query("DELETE FROM tb_popular_artists")
    suspend fun deleteAllArtists()

    @Query("SELECT * FROM tb_popular_artists")
    suspend fun getArtists(): List<Artist>
}