package com.sibdev.ktorclienttest

import kotlinx.serialization.Serializable

@Serializable
data class PostResponseModel(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)
