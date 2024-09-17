package org.example.lesson_1_10.lesson_8

fun main() {
    val ingredientArray = arrayOf(
        "картофель",
        "помидор",
        "соль",
        "перец черный горошек",
        "базилик",
        "говядина",
        "лавровый лист",
    )
    println("Введите название ингредиента, который необходимо найти.")
    val ingredient = readln()
    val index = ingredientArray.indexOf(ingredient)
    if (index >= 0) {
        println("Ингредиент $ingredient в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}