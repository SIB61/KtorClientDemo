package com.sibdev.ktorclienttest

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.auth.*
import io.ktor.client.plugins.auth.providers.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.flow.MutableStateFlow
import java.lang.reflect.Type

class KtorClientRepo {
    companion object {
        val client = HttpClient(Android) {
            install(ContentNegotiation) {
                json()
            }
//            install(Auth){
//                bearer {
//                    loadTokens {
//                        BearerTokens("wA7lsJXkGQnz7U9TvZh2zebVDT4-5FGcyJ-WilCetYk","Ql4XZBttWf477f00Gi5gRioDl4I_P6QP1eQ9jx21juY")
//                    }
//                }
//           }
        }
    }
    suspend fun getPosts() : List<UnsplashModel> {
        return client.get {
            url("https://api.unsplash.com/photos")
            headers{
                append(HttpHeaders.Authorization,UrlConstants.ACCESS_KEY)
            }
        }.body()
    }

    

}