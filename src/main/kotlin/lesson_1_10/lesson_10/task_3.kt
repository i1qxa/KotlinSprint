package org.example.lesson_1_10.lesson_10

import kotlin.random.Random

fun main() {
    println("Введите длину пароля")
    val passLength = readln().toInt()
    val pass = generatePass(passLength)
    println("Ваш пароль: $pass")
}

fun generatePass(passLength: Int): String {
    var pass = ""
    for (i in 0 until  passLength / 2) {
        pass += getRandomDigit()
        pass += getRandomSymbol()
    }
    if (passLength %2 != 0) pass += getRandomDigit()
    return pass
}

fun getRandomDigit():Int = Random.nextInt(10)

fun getRandomSymbol():Char = Char((' '.code..'/'.code).random())