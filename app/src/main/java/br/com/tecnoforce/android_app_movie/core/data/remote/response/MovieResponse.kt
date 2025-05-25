package br.com.tecnoforce.android_app_movie.core.data.remote.response

import br.com.tecnoforce.android_app_movie.core.data.remote.model.MovieResult
import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("page")
    val page: Int,

    @SerializedName("movieResults")
    val movieResults: List<MovieResult>,

    @SerializedName("total_pages")
    val totalPages: Int,

    @SerializedName("total_results")
    val totalResults: Int
)