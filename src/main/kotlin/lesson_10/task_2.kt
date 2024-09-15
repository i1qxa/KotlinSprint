package org.example.lesson_10

const val MIN_CREDS_LENGTH = 4

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val pass = readln()
    val validateResultMsg = if (validateCreds(login) && validateCreds(pass)) {
        "Добро пожаловать, $login"
    }
    else {
        "Логин или пароль недостаточно длинные"
    }
    println(validateResultMsg)
}

fun validateCreds(creds:String):Boolean = creds.length >= MIN_CREDS_LENGTH