package com.example.burger_hub_fb.data.dto

data class BurgerResponse(
    val desc: String?,
    val id: Int?,
    val images: List<ImageResponse?>?,
    val ingrediants: List<Ingrediant?>?,
    val name: String?,
    val price: Double?,
    val veg: Boolean?

)

data class ImageResponse(
    val lg: String,
    val sm: String,
)

data class Ingrediant(
    val id: Int,
    val img: String,
    val name: String,
)
