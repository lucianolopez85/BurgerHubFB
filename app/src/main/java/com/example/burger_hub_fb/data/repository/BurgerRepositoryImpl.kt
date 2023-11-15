package com.example.burger_hub_fb.data.repository

import com.example.burger_hub_fb.data.api.ServiceAPI
import com.example.burger_hub_fb.data.dto.BurgerResponseDTO
import javax.inject.Inject

class BurgerRepositoryImpl @Inject constructor(
    private val serviceAPI: ServiceAPI
) : BurgerRepository {

    override suspend fun getBurgers(): List<BurgerResponseDTO> {
        return serviceAPI.getBurgers()
    }

    override suspend fun getBurgerById(burgerId: Int): BurgerResponseDTO {
        return serviceAPI.getBurgerById(burgerId)
    }

    override suspend fun getBurgerByName(name: String): List<BurgerResponseDTO> {
        return serviceAPI.getBurgerByName(name)
    }

}