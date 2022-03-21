package com.sibdev.ktorclienttest

import kotlinx.serialization.Serializable

@Serializable
data class Urls(
    val full: String?,
    val raw: String?,
    val regular: String?,
    val small: String?,
    val small_s3: String?,
    val thumb: String?
)