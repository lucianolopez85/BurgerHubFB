package com.example.burger_hub_fb.domain.model

data class Burger(
    val desc: String?,
    val id: Int?,
    val image: List<Image?>?,
    val ingredients: List<Ingredient?>?,
    val name: String?,
    val price: Double?,
    val veg: Boolean?

)
