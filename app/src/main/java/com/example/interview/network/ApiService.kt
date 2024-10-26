package com.example.interview.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService {
    @GET("/")
   suspend fun get(@QueryMap map: Map<String, String>): Response<>
}