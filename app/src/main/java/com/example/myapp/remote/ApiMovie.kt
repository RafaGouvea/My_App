package com.example.myapp.remote

import com.example.myapp.moviemodel.GenreListResponse
import com.example.myapp.moviemodel.MovieListResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiMovie {
    @GET("movie/top_rated?api_key=35083a0c4b0e663f1f3f4ba7ccc7c328&language=en-US&page=1")
    fun getMovieList(): Call<MovieListResponse>

    @GET("genre/movie/list?api_key=35083a0c4b0e663f1f3f4ba7ccc7c328&language=en-US")
    fun getGenreList(): Call<GenreListResponse>
}