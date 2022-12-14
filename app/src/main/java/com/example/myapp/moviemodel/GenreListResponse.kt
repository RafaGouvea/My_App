package com.example.myapp.moviemodel

data class GenreListResponse(
    val genres: List<GenreResponse>,
)

data class GenreResponse(
    val id: Int,
    val name: String,
)

fun GenreResponse.toModel(): GenreModel {
    return GenreModel(
        id = id,
        name = name
    )
}