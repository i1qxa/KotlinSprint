package org.example.lesson_10

import java.util.*
import kotlin.random.Random

fun main() {
    var humanWinAmount = 0
    if (launchGame()) humanWinAmount++
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    while (readln().lowercase(Locale.getDefault()) == "да") {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        if (launchGame()) humanWinAmount++
    }
    println("Человек победил: $humanWinAmount раз")
}

fun getRandomNum(): Int = Random.nextInt(7)

fun launchGame():Boolean {
    val computerScore = getRandomNum()
    println("Компьютер бросил: $computerScore")
    val humanScore = getRandomNum()
    println("Человек бросил: $humanScore")
    val gameResult = when {
        computerScore > humanScore -> {
            "Победила машина"
        }
        computerScore < humanScore -> {
            "Победил человек"
        }
        else -> {
            "Победила дружба"
        }
    }
    println(gameResult)
    return gameResult == "Победил человек"
}