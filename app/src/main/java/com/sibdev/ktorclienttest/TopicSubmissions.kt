package com.sibdev.ktorclienttest

import kotlinx.serialization.Serializable

@Serializable
data class TopicSubmissions(
    val blockchain: Blockchain?=null
)