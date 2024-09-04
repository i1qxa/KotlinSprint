package org.example.lesson_6

fun main() {
    val guessDigit = (1..10).random().toString()
    var tryAmount = 5
    println("Угадайте число от 1го до 9ти. У вас 5 попыток")
    while (tryAmount > 0) {
        val digit = readln()
        if (digit == guessDigit) {
            println("Это была великолепная игра!")
            return
        } else {
            tryAmount--
            println("Неверно. У вас осталось $tryAmount попыток.")
        }
    }
    println("Было загадано число $guessDigit")
}
