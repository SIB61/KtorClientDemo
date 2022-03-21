package com.sibdev.ktorclienttest

import kotlinx.serialization.Serializable

@Serializable
data class ProfileImageX(
    val large: String?,
    val medium: String?,
    val small: String?
)