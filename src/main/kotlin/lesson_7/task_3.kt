package org.example.lesson_7

fun main(){
    var limitNum: Int
    while (true){
        println("Введите чило:")
        val numAsString = readln()
        try {
            limitNum = numAsString.toInt()
            if (limitNum>2) break
            else println("Введенное число должно быть больше 2")
        }catch (e:NumberFormatException){
            println("Необходимо ввести число")
        }
    }
    val progression = 2..<limitNum step(2)
    val evenNumbers = StringBuilder()
    for (num in progression){
        evenNumbers.append(num)
        evenNumbers.append(",")
    }
    println("Четные числа от 0 до $limitNum: ${evenNumbers.dropLast(1)}")
}