package org.example.lesson_9

fun main() {
    val baseRecipeItemAmount = mutableListOf(2, 50, 15)
    println("На сколько порций необходимо приготовить омлет?")
    val numServings = readln().toInt()
    val recipeItemAmount = baseRecipeItemAmount.map {
        it*numServings
    }
    println("На $numServings порций вам понадобится: Яиц – ${recipeItemAmount[0]}, молока – ${recipeItemAmount[1]}" +
            ", сливочного масла – ${recipeItemAmount[2]}")
}