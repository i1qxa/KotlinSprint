package org.example.lesson_1_10.lesson_8

fun main(){
    println("Укажите количество ингредиентов в рецепте")
    val ingredientArray = Array(readln().toInt()) { readln() }
    println("Список ингредиентов: ${ingredientArray.joinToString(separator = ", ")}")
}