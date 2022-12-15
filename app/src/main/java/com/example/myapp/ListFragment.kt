package com.example.myapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.moviemodel.MovieAdapter
import com.example.myapp.moviemodel.*
import com.example.myapp.remote.ApiMovie
import com.example.myapp.remote.RetrofitSetup
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListFragment : Fragment() {

    private lateinit var movieAdapter: MovieAdapter
    private lateinit var recyclerview: RecyclerView
    val movieListLiveData = MutableLiveData<List<MovieModel>>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recycle_view, container, false)

        initRecycleView(view)
        loadMovieList()

        return view
    }


    private fun initRecycleView(view: View) {
        this.movieAdapter = MovieAdapter()
        recyclerview = view.findViewById(R.id.fragment_recycle_view)
        recyclerview.layoutManager = LinearLayoutManager(requireContext())
        recyclerview.adapter = this.movieAdapter
    }

    private fun loadMovieList(){

        val apiInterface: ApiMovie = RetrofitSetup.createService(ApiMovie::class.java)
        val call: Call<MovieListResponse> = apiInterface.getMovieList()

        call.enqueue(object : Callback<MovieListResponse> {
            override fun onResponse(
                call: Call<MovieListResponse>,
                response: Response<MovieListResponse>,
            ) {
                if (response.isSuccessful) {
                    val movieListResponse: MovieListResponse? = response.body()
                    val movieModelList = movieListResponse?.results?.map {
                        it.toModel()
                    }
                    movieModelList?.let {
                        movieListLiveData.postValue(it)
                    }
                    Log.d("###", movieModelList!!.joinToString())
                }
            }
            override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                Log.e("###", t.message?: "")
            }
        })
    }
}
