package org.example.tmp

import kotlin.random.Random

fun main(){
    if (antiRobot()){
        println("Добро пожаловать")
        println("Введите логин")
        val login = readln()
        println("Введите пароль")
        val password = readln()
        var isLoginSuccess = false
        while (!isLoginSuccess){
            println("Логин:")
            val loginEntered = readln()
            println("Пароль:")
            val passwordEntered = readln()
            isLoginSuccess = (login == loginEntered)&&(password==passwordEntered)
            if (!isLoginSuccess){
                println("Неверная комбинация логин и пароль. Попробуйте снова")
            }
        }
        println("Авторизация прошла успешно")
    }else{
        println("Доступ запрещен")
    }

}

fun antiRobot():Boolean{
    var tryAmount = 3
    var isNotRobot = false
    while (tryAmount>0&&isNotRobot==false){
        val firstDigit = Random.nextInt(9)
        val secondDigit = Random.nextInt(9)
        val result = (firstDigit+secondDigit).toString()
        println("Решите пример $firstDigit + $secondDigit = ?")
        val answer = readln()
        if (result == answer){
            isNotRobot = true
        }
        tryAmount--
    }
    return isNotRobot
}