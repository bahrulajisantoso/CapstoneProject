package com.example.capstoneproject.core.data.source.remote.network

import com.example.capstoneproject.core.data.source.remote.response.TeamsResponse
import retrofit2.http.GET

interface ApiService {
    @GET("api/v1/json/3/search_all_teams.php?l=English Premier League")
    suspend fun getList(): TeamsResponse
}
