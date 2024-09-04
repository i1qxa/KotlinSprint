package org.example.lesson_7

fun main() {
    var passLength: Int
    while (true) {
        println("Введите длину пароля, не меньше 6 символов")
        try {
            passLength = readln().toInt()
            if (passLength >= 6) break
            else println("Длина пароля должна быть больше 6")
        } catch (e: NumberFormatException) {
            println("Необходимо указать длину пароля в числовом формате")
        }
    }
    val alphabet = 'a'..'z'
    val alphabetUpper = 'A'..'Z'
    val digitInterval = 0..9
    val validCharacters = alphabet + alphabetUpper + digitInterval
    var isCharExist = false
    var isCharUpperExist = false
    var isDigitExist = false
    val password = StringBuilder()
    while (passLength > 0) {
        if (!isCharExist) {
            password.append(alphabet.random())
            isCharExist = true
            passLength--
            continue
        }
        if (!isCharUpperExist) {
            password.append(alphabetUpper.random())
            isCharUpperExist = true
            passLength--
            continue
        }
        if (!isDigitExist) {
            password.append(digitInterval.random())
            isDigitExist = true
            passLength--
            continue
        }
        password.append(validCharacters.random())
        passLength--
    }
    println("Пароль: $password")
}