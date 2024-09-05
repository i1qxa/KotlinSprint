package org.example.lesson_8

fun main(){
    println("Укажите количество ингредиентов в рецепте")
    val ingredientAmount = readln().toInt()
    val ingredientArray = Array(ingredientAmount) { "" }
    var index = 0
    while (index < ingredientAmount) {
        ingredientArray[index] = readln()
        index++
    }
    val recipe = StringBuilder()
    ingredientArray.map {
        recipe.append(it)
        recipe.append(", ")
    }
    println("Список ингредиентов: ${recipe.dropLast(2)}")
}