package br.com.tecnoforce.android_app_movie.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class Genre(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String
)