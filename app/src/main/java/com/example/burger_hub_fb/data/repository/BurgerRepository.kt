package com.example.burger_hub_fb.data.repository

import com.example.burger_hub_fb.data.dto.BurgerResponseDTO

interface BurgerRepository {

    suspend fun getBurgers(): List<BurgerResponseDTO>
    suspend fun getBurgerById(burgerId: Int): BurgerResponseDTO
    suspend fun getBurgerByName(name: String) : List<BurgerResponseDTO>
}