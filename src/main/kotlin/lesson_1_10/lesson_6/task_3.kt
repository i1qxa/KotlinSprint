package org.example.lesson_1_10.lesson_6

fun main(){
    var isSecondsSuccess = false
    var secondsAsInt = 0
    while (!isSecondsSuccess){
        println("Введите количество секунд которые необходимо засечь")
        val secondsAsString = readln()
        try {
            secondsAsInt = secondsAsString.toInt()
            isSecondsSuccess=true
        }catch (e:NumberFormatException){
            println("Ошибка. Секунды нужно ввести в числовом формате")
        }
    }
    var counter = 0
    while (counter<secondsAsInt) {
        println("Осталось секунд:${secondsAsInt-counter}")
        Thread.sleep(1000)
        counter++
    }
    println("Время вышло")
}