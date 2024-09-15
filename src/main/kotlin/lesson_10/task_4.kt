package org.example.lesson_10

import java.util.*
import kotlin.random.Random

fun main() {
    var humanWinAmount = 0
    if (launchGame() == GameResult.HUMAN_WIN) humanWinAmount++
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    while (readln().lowercase(Locale.getDefault()) == "да") {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        if (launchGame() == GameResult.HUMAN_WIN) humanWinAmount++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    }
    println("Человек победил: $humanWinAmount раз")
}

fun getRandomNum(): Int = Random.nextInt(7)

fun launchGame():GameResult {
    val computerScore = getRandomNum()
    println("Компьютер бросил: $computerScore")
    val humanScore = getRandomNum()
    println("Человек бросил: $humanScore")
    val gameResult = when {
        computerScore > humanScore -> {
            GameResult.COMPUTER_WIN
        }
        computerScore < humanScore -> {
            GameResult.HUMAN_WIN
        }
        else -> {
            GameResult.DRAW
        }
    }
    println(gameResult)
    return gameResult
}
