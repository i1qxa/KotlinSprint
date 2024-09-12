package org.example.lesson_9

fun main() {
    val recipeList = listOf("Капуста", "Картофель", "Мясо", "Свекла", "Зелень", "Специи")
    println("В рецепте есть следующие ингредиенты:")
    recipeList.forEach { recipeItem ->
        println(recipeItem)
    }
}