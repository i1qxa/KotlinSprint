package org.example.lesson_1_10.lesson_8

fun main() {
    val ingredientArray = arrayOf(
        "яйца",
        "масло",
        "бекон",
        "зелень",
        "соль",
    )
    println("Список ингредиентов: ${ingredientArray.toFormattedString()}")
    println("Какой ингредиент вы хотите заменить?")
    val targetIngredient = readln()
    val targetIngredientIndex = ingredientArray.indexOf(targetIngredient)
    if (targetIngredientIndex >= 0) {
        println("На какой ингредиент хотите заменить $targetIngredient?")
        val newIngredient = readln()
        ingredientArray[targetIngredientIndex] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredientArray.toFormattedString()}")
    } else {
        println("Такого ингредиента нет в списке")
    }
}

fun Array<String>.toFormattedString():String {
    val arrayAsStringBuilder = StringBuilder()
    this.map {
        arrayAsStringBuilder.append(it)
        arrayAsStringBuilder.append(", ")
    }
    return (arrayAsStringBuilder.dropLast(2).toString())
}