package org.example.lesson_10

import kotlin.random.Random

fun main() {
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
}

fun getRandomNum(): Int = Random.nextInt(7)