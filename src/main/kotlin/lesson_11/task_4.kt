package org.example.lesson_11

class RecipeCategory(
    val id: Int,
    val title: String,
    val logo: String,
    val description: String,
    val recipeList:List<Recipe>,
)

class Ingredient(
    val id: Int,
    val name: String,
    val amount: Double,
    val unitOM: String,
)

class Recipe(
    val id: Int,
    val name: String,
    val logo: String,
    var inFavorite: Boolean = false,
    val categoryId: Int,
    val numberServings: Int,
    val ingredients: List<Ingredient>,
)