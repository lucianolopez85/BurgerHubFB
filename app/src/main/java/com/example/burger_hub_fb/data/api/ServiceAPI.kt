package com.example.burger_hub_fb.data.api

import com.example.burger_hub_fb.data.dto.BurgerResponseDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServiceAPI {

    @GET("burgers")
    suspend fun getBurgers(): List<BurgerResponseDTO>

    @GET("burgers/{burger_id}")
    suspend fun getBurgerById(
        @Path("burger_id") burgerId: Int
    ): BurgerResponseDTO

    @GET("{find-burger/}")
    suspend fun getBurgerByName(
        @Query("search") name: String
    ): List<BurgerResponseDTO>
}