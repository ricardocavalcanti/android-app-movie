package br.com.tecnoforce.android_app_movie.core.data.remote.response

import br.com.tecnoforce.android_app_movie.core.data.remote.model.SearchResult
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("page")
    val page: Int,

    @SerializedName("results")
    val results: List<SearchResult>,

    @SerializedName("total_pages")
    val totalPages: Int,

    @SerializedName("total_results")
    val totalResults: Int
)