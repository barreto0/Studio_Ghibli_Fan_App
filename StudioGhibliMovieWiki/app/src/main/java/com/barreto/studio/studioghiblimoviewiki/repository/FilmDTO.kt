package com.barreto.studio.studioghiblimoviewiki.repository

import com.google.gson.annotations.SerializedName


data class FilmDTO ( //data transfer object
    val id: String? = null,
    val title: String? = null,
    val description: String? = null,

    @SerializedName("release_date")
    val releaseDate: String? = null,

    val director: String? = null
)
