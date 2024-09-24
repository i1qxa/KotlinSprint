package org.example.lesson_18

fun main() {

    listOf(DiceFour(), DiceSix(), DiceEight()).forEach { dice ->
        dice.throwDice()
    }

}

abstract class Dice() {

    abstract fun throwDice()

}

class DiceFour() : Dice() {

    override fun throwDice() {
        println("Вы бросили:${(1..4).random()}")
    }
}

class DiceSix() : Dice() {

    override fun throwDice() {
        println("Вы бросили:${(1..6).random()}")
    }
}

class DiceEight() : Dice() {

    override fun throwDice() {
        println("Вы бросили:${(1..8).random()}")
    }
}