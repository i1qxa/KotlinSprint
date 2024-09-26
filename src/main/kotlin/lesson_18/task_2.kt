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

    override var diceValue: Int = getRandomIntInRange(1..4)

    override fun throwDice() {
        diceValue = getRandomIntInRange(1..4)
        println("Вы бросили:$diceValue")
    }
}

class DiceSix : Dice() {

    override var diceValue: Int = getRandomIntInRange(1..6)

    override fun throwDice() {
        diceValue = getRandomIntInRange(1..6)
        println("Вы бросили:$diceValue")
    }
}

class DiceEight : Dice() {

    override var diceValue: Int = getRandomIntInRange(1..8)

    override fun throwDice() {
        diceValue = getRandomIntInRange(1..8)
        println("Вы бросили:$diceValue")
    }
}

fun getRandomIntInRange(range: IntRange): Int = range.random()