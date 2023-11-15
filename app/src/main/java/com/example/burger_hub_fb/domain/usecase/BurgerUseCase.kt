package com.example.burger_hub_fb.domain.usecase

import com.example.burger_hub_fb.data.repository.BurgerRepository
import com.example.burger_hub_fb.domain.converter.BurgerConverter
import com.example.burger_hub_fb.domain.vo.BurgerVO
import javax.inject.Inject

class BurgerUseCase @Inject constructor(
    private val repository: BurgerRepository,
    private val converter: BurgerConverter
) {

    suspend fun getBurgers(): List<BurgerVO> {
        val burgerResponseDTOs = repository.getBurgers()
        return converter.convert(burgerResponseDTOs)
    }

    suspend fun getBurgerById(burgerId: Int): BurgerVO {
        val burgerResponseDTO = repository.getBurgerById(burgerId)
        return converter.convert(listOf(burgerResponseDTO)).first()
        TODO("Precisa criar outro método no converter com regra diferente")
    }

    suspend fun getBurgerByName(name: String): List<BurgerVO> {
        val burgerResponseDTOs = repository.getBurgerByName(name)
        return converter.convert(burgerResponseDTOs)
        TODO("Precisa criar outro método no converter com regra diferente")


    }
}
