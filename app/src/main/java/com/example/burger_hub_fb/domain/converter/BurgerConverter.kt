package com.example.burger_hub_fb.domain.converter

import com.example.burger_hub_fb.data.dto.BurgerResponseDTO
import com.example.burger_hub_fb.domain.vo.BurgerVO
import com.example.burger_hub_fb.domain.vo.ImageVO
import com.example.burger_hub_fb.domain.vo.IngredientVO

class BurgerConverter {

    fun convert(data: List<BurgerResponseDTO>) : List<BurgerVO> =
        data.map { dto->
            BurgerVO(
                desc = dto.desc,
                id = dto.id,
                imageVO = dto.imageResponseDTO?.map {
                       ImageVO(
                           lg = it?.lg,
                           sm = it?.sm
                       )
                },
                ingredientVO = dto.ingredientResponsDTO?.map {
                    IngredientVO(
                        id = it?.id,
                        img = it?.img,
                        name = it?.name
                    )
                },
                name = dto.name,
                price = dto.price,
                veg = dto.veg
            )
        }
}