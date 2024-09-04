package org.example.lesson_6

fun main(){
    var isSecondsSuccess = false
    var secondsAsLong = 0L
    while (!isSecondsSuccess){
        println("Введите количество секунд которые необходимо засечь")
        val secondsAsString = readln()
        try {
            secondsAsLong = secondsAsString.toLong()
            isSecondsSuccess=true
        }catch (e:NumberFormatException){
            println("Ошибка. Секунды нужно ввести в числовом формате")
        }
    }
    Thread.sleep(secondsAsLong*1000)
    println("Прошло $secondsAsLong секунд")
}