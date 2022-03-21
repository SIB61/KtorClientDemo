package com.sibdev.ktorclienttest

import kotlinx.serialization.Serializable

@Serializable
data class Blockchain(
    val approved_on: String,
    val status: String
)