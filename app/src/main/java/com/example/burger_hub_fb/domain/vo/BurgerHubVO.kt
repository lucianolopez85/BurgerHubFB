package com.example.burger_hub_fb.domain.vo

data class BurgerHubVO(
    val desc: String,
    val id: Int,
    val images: List<ImageVO>,
    val ingredients: List<IngredientVO>,
    val name: String,
    val price: Double,
    val veg: Boolean
)

data class ImageVO(
    val lg: String,
    val sm: String,
)

data class IngredientVO(
    val id: Int,
    val img: String,
    val name: String
)
