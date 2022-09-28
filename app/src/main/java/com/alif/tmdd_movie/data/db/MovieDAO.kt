package com.alif.tmdd_movie.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.alif.tmdd_movie.data.model.movie.Movie

@Dao
interface MovieDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies: List<Movie>)

    @Query("DELETE FROM tb_popular_movies")
    suspend fun deleteAllMovies()

    @Query("SELECT * FROM tb_popular_movies")
    suspend fun getMovies(): List<Movie>
}