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
import kotlinx.serialization.json.Json
import java.lang.reflect.Type

class KtorClientRepo {
    companion object {
        val client = HttpClient(Android) {
            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                })

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
    suspend fun getImages() : List<UnsplashModel> {
        return client.get {
            url("https://api.unsplash.com/photos")
            headers{
                append(HttpHeaders.Authorization,UrlConstants.ACCESS_KEY)
            }
        }.body()
    }
    suspend fun getSearchedImages(s:String) : List<UnsplashModel> {
        return client.get {
            url("https://api.unsplash.com/photos/?query=$s")
            headers{
                append(HttpHeaders.Authorization,UrlConstants.ACCESS_KEY)
            }
        }.body()
    }

    

}