package org.example.lesson_8

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
    for (i in ingredientArray) {
        if (i == ingredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}