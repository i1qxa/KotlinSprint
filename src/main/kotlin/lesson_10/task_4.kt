package org.example.lesson_10

import java.util.*
import kotlin.random.Random

const val WIN_COMPUTER = "Победила машина"
const val WIN_HUMAN = "Победил человек"
const val WIN_DRAW = "Победила дружба"

fun main() {
    var humanWinAmount = 0
    do {
        val gameResult = launchGame()
        println(gameResult)
        if (gameResult == WIN_HUMAN) humanWinAmount++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while ((readln().lowercase(Locale.getDefault()) == "да"))
    println("Человек победил: $humanWinAmount раз")
}

fun throwDice(): Int = Random.nextInt(7)

fun launchGame(): String {
    val computerScore = throwDice()
    println("Компьютер бросил: $computerScore")
    val humanScore = throwDice()
    println("Человек бросил: $humanScore")
    val gameResult = when {
        computerScore > humanScore -> {
            WIN_COMPUTER
        }

        computerScore < humanScore -> {
            WIN_HUMAN
        }

        else -> {
            WIN_DRAW
        }
    }
    return gameResult
}
