package com.example.burger_hub_fb.domain.vo

data class BurgerVO(
    val desc: String?,
    val id: Int?,
    val imageVO: List<ImageVO?>?,
    val ingredientVO: List<IngredientVO?>?,
    val name: String?,
    val price: Double?,
    val veg: Boolean?

)
