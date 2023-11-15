package com.example.burger_hub_fb.domain.usecase

import com.example.burger_hub_fb.data.dto.BurgerResponseDTO
import com.example.burger_hub_fb.data.repository.BurgerRepository
import javax.inject.Inject

class GetBurgersUseCase @Inject constructor(
    private val burgerRepository: BurgerRepository
) {

    suspend operator fun invoke(): List<BurgerResponseDTO> {
        return burgerRepository.getBurgers()
    }
}