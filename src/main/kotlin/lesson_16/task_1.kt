package org.example.lesson_16

fun main() {
    Dice().printDiceValue()
}

class Dice {
    private val value: Int
        get() = (1..6).random()

    fun printDiceValue() {
        println("Вам выпало: $value")
    }

}