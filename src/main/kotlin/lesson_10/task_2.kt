package org.example.lesson_10

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val pass = readln()
    val validateResultMsg = if (validateLoginAndPass(login, pass)) {
        "Добро пожаловать, $login"
    }
    else {
        "Логин или пароль недостаточно длинные"
    }
    println(validateResultMsg)
}

fun validateLoginAndPass(login:String, pass:String):Boolean = (login.length >= 4) && (pass.length >=4)