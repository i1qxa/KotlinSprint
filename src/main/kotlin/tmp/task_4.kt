package org.example.tmp

import kotlin.random.Random

fun main() {
    val guessDigit = Random.nextInt(9).toString()
    var tryAmount = 5
    var isWin = false
    println("Угадайте число от 1го до 9ти. У вас 5 попыток")
    while (tryAmount > 0 && !isWin) {
        val digit = readln()
        if (digit == guessDigit) {
            println("Это была великолепная игра!")
            isWin = true
        } else {
            tryAmount--
            println("Неверно. У вас осталось $tryAmount попыток.")
        }
    }
    if (!isWin) println("Было загадано число $guessDigit")
}
