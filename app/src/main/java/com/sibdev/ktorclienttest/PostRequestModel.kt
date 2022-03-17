package com.sibdev.ktorclienttest

import kotlinx.serialization.Serializable

@Serializable
data class PostRequestModel(
    val body: String,
    val title: String,
    val userId: Int
)