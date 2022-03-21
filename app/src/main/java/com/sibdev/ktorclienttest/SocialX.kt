package com.sibdev.ktorclienttest

import kotlinx.serialization.Serializable

@Serializable
data class SocialX(
    val instagram_username:String?,
    val paypal_email: String?,
    val portfolio_url: String?,
    val twitter_username: String?
)