package org.example.lesson_1_10.lesson_9

fun main() {
    println("Введите 5 ингредиентов разделенных , (запятая с пробелом)")
    val inputRecipe = readln().split(", ").toSet().sorted()
    val recipeAsString = inputRecipe.joinToString(", ")
    println(recipeAsString[0].uppercaseChar() + recipeAsString.substring(1))
}