package com.sibdev.ktorclienttest

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.flow.MutableStateFlow

class KtorClientRepo {
    companion object {
        val client = HttpClient(Android) {
            install(ContentNegotiation) {
                json()
            }

        }
    }
    suspend fun getPosts() : List<PostResponseModel> {
        return client.get { url("https://jsonplaceholder.typicode.com/posts") }.body()
    }
}