package org.example.lesson_18

fun main() {

    listOf(DiceFour(), DiceSix(), DiceEight()).forEach { dice ->
        dice.throwDice()
    }

}

abstract class Dice() {

    abstract var diceValue:Int
    abstract fun throwDice()

}

class DiceFour() : Dice() {

    override var diceValue: Int
        get() = (1..4).random()
        set(value) {}

    override fun throwDice() {
        println("Вы бросили:$diceValue")
    }
}

class DiceSix() : Dice() {

    override var diceValue: Int
        get() = (1..6).random()
        set(value) {}

    override fun throwDice() {
        println("Вы бросили:$diceValue")
    }
}

class DiceEight() : Dice() {

    override var diceValue: Int
        get() = (1..8).random()
        set(value) {}

    override fun throwDice() {
        println("Вы бросили:$diceValue")
    }
}