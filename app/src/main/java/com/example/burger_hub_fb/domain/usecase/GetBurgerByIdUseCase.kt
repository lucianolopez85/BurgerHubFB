package com.example.burger_hub_fb.domain.usecase

import com.example.burger_hub_fb.data.dto.BurgerDTO
import com.example.burger_hub_fb.data.repository.BurgerRepository
import javax.inject.Inject

class GetBurgersUseCase @Inject constructor(
    private val burgerRepository: BurgerRepository
) {

    suspend operator fun invoke(): List<BurgerDTO> {
        return burgerRepository.getBurgers()
    }
}