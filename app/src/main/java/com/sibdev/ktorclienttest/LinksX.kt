package com.sibdev.ktorclienttest

import kotlinx.serialization.Serializable

@Serializable
data class LinksX(
    val followers: String?,
    val following: String?,
    val html: String?,
    val likes: String?,
    val photos: String?,
    val portfolio: String?,
    val self: String?
)