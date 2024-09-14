package org.example.lesson_9

fun main() {
    println("Введите пять ингредиентов разделенных , (запятой с пробелом)")
    val inputIngredients = readln().split(", ")
    val sortedIngredientList = inputIngredients.sorted()
    println(sortedIngredientList)
}