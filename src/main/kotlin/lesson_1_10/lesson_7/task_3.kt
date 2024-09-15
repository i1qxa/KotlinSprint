package org.example.lesson_1_10.lesson_7

fun main() {
    var limitNum: Int
    while (true) {
        println("Введите чило:")
        val numAsString = readln()
        try {
            limitNum = numAsString.toInt()
            if (limitNum > 1) break
            else println("Введенное число должно быть больше 1")
        }catch (e:NumberFormatException) {
            println("Необходимо ввести число")
        }
    }
    val progression = 0..< limitNum step(2)
    val evenNumbers = StringBuilder()
    for (num in progression) {
        evenNumbers.append(num)
        evenNumbers.append(",")
    }
    println("Четные числа от 0 до $limitNum: ${evenNumbers.dropLast(1)}")
}