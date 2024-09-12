package org.example.lesson_9

import java.util.*

fun main() {
    val baseRecipeList = mutableListOf("Яйца", "Бекон", "Масло растительное")
    println("В рецепте есть базовые ингредиенты: ${baseRecipeList.joinToString(separator = ", ")}")
    println("Желаете добавить еще?")
    val shouldAddNewRecipeItem = readln().lowercase(Locale.getDefault()) == "да"
    if (shouldAddNewRecipeItem) {
        println("Какой ингредиент вы хотите добавить?")
        baseRecipeList.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${baseRecipeList.joinToString(separator = ", ")}")
    }
}