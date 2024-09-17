package org.example.lesson_1_10.lesson_7

fun main(){
    var timerInSeconds:Int
    while (true){
        println("Введите длительность таймера в секундах")
        try {
            timerInSeconds = readln().toInt()
            if (timerInSeconds>0)break
            else println("Необходимо ввести положительное число")
        }catch (e:NumberFormatException){
            println("Необходимо указать секунды в числовом формате")
        }
    }
    for (second in 0 until timerInSeconds){
        println("Осталось ${timerInSeconds-second} секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}