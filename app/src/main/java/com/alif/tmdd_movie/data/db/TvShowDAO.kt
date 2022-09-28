package com.alif.tmdd_movie.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.alif.tmdd_movie.data.model.tv.TvShow

@Dao
interface TvShowDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShows(tvShows: List<TvShow>)

    @Query("DELETE FROM tb_popular_tv_shows")
    suspend fun deleteAllTvShows()

    @Query("SELECT * FROM tb_popular_tv_shows")
    suspend fun getTvShows(): List<TvShow>
}