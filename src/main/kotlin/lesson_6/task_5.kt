package org.example.lesson_6

fun main(){
    if (antiRobot()){
        println("Добро пожаловать")
        println("Введите логин")
        val login = readln()
        println("Введите пароль")
        val password = readln()
        var isLoginSuccess = false
        while (!isLoginSuccess) {
            println("Логин:")
            val loginEntered = readln()
            println("Пароль:")
            val passwordEntered = readln()
            isLoginSuccess = (login == loginEntered) && (password == passwordEntered)
            if (!isLoginSuccess) {
                println("Неверная комбинация логин и пароль. Попробуйте снова")
            }
        }
        println("Авторизация прошла успешно")
    } else {
        println("Доступ запрещен")
    }
}

fun antiRobot(): Boolean{
    val digitRange = 1..10
    var tryAmount = 3
    while (tryAmount > 0) {
        val firstDigit = digitRange.random()
        val secondDigit = digitRange.random()
        val result = (firstDigit+secondDigit).toString()
        println("Решите пример $firstDigit + $secondDigit = ?")
        val answer = readln()
        if (result == answer) {
            return true
        }
        println("Неверно")
        tryAmount--
    }
    return false
}