package br.com.tecnoforce.android_app_movie.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class ProductionCountry(
    @SerializedName("iso_3166_1")
    val iso31661: String,

    @SerializedName("name")
    val name: String
)