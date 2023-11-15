package com.example.burger_hub_fb.data.model

data class BurgerResponse(
    val desc: String?,
    val id: Int?,
    val imageResponse: List<ImageResponse?>?,
    val ingredientResponses: List<IngredientResponse?>?,
    val name: String?,
    val price: Double?,
    val veg: Boolean?

)
