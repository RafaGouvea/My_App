package com.example.myapp.moviemodel

import com.google.gson.annotations.SerializedName

data class MovieListResponse(
    val results: List<MovieResponse>,
)

data class MovieResponse(
    val id: Int,
    @SerializedName("poster_path") val posterPath: String,
    val overview: String,
    val title: String,
    //@SerializedName("genre_ids") val genreIdList: List<String>,
    @SerializedName("release_date") val releaseDate: String
)

fun MovieResponse.toModel(): MovieModel {
    return MovieModel(
        id = id,
        posterPath = posterPath,
        overview = overview,
        title = title,
        releaseDate = releaseDate
    )
}