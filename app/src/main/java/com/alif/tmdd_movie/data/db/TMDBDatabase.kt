package com.alif.tmdd_movie.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alif.tmdd_movie.data.model.artist.Artist
import com.alif.tmdd_movie.data.model.movie.Movie
import com.alif.tmdd_movie.data.model.tv.TvShow

@Database(
    entities = [Movie::class, TvShow::class, Artist::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase: RoomDatabase() {

    abstract fun movieDao(): MovieDAO
    abstract fun tvShowDao(): TvShowDAO
    abstract fun artistDao(): ArtistDAO
}