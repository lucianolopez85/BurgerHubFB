package com.example.burger_hub_fb.data.dto

data class BurgerResponseDTO(
    val desc: String?,
    val id: Int?,
    val imageResponseDTO: List<ImageResponseDTO?>?,
    val ingredientResponsDTO: List<IngredientResponseDTO?>?,
    val name: String?,
    val price: Double?,
    val veg: Boolean?

)
