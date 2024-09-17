package org.example.lesson_1_10.lesson_6

fun main(){
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
}