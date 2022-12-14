package com.example.myapp.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapp.R
import com.example.myapp.moviemodel.MovieModel
import kotlinx.android.synthetic.main.res_item_person.view.*

class MovieAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<MovieModel> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_person, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder){
            is MovieViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(movie: List<MovieModel>){

        this.items = movie

    }

    class MovieViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val movieTitle = itemView.input_title
        private val movieTime = itemView.input_time
        private val movieGenre = itemView.input_genre
        private val movieDescription = itemView.input_description
        private val movieProfile = itemView.profile

        fun bind(movieModel: MovieModel){

            movieTitle.text = movieModel.title
            movieTime.text = movieModel.releaseDate
            //movieGenre.text = movieModel.genreNameList
            movieDescription.text = movieModel.overview

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(movieModel.posterPath)
                .into(movieProfile)

        }

    }

}
