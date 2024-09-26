package org.example.lesson_18

fun main() {

    listOf(DiceFour(), DiceSix(), DiceEight()).forEach { dice ->
        dice.throwDice()
    }

}

abstract class Dice {

    abstract var diceValue: Int
    abstract fun throwDice()

}

class DiceFour : Dice() {

    override var diceValue: Int = (1..4).random()

    override fun throwDice() {
        diceValue = (1..4).random()
        println("Вы бросили:$diceValue")
    }
}

class DiceSix : Dice() {

    override var diceValue: Int = (1..6).random()

    override fun throwDice() {
        diceValue = (1..6).random()
        println("Вы бросили:$diceValue")
    }
}

class DiceEight : Dice() {

    override var diceValue: Int = (1..8).random()

    override fun throwDice() {
        diceValue = (1..8).random()
        println("Вы бросили:$diceValue")
    }
}
