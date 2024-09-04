package org.example.lesson_7

fun main(){
    val digitRange = 1000..9999
    while (true){
        val smsCode = digitRange.random().toString()
        println("Ваш код авторизации:$smsCode")
        println("Введите код полученный в СМС сообщении")
        val enteredCode = readln()
        if (smsCode==enteredCode){
            println("Добро пожаловать")
            return
        }
    }
}