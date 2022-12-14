package com.example.myapp.moviemodel

data class MovieModel(
    val id: Int,
    val posterPath: String,
    val overview: String,
    val title: String,
    val genreNameList: List<String>,
    val releaseDate: String
)