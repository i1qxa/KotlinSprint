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
    val password = StringBuilder()
    password.append(alphabet.random())
    password.append(alphabetUpper.random())
    password.append(digitInterval.random())
    passLength-=3
    while (passLength > 0) {
        password.append(validCharacters.random())
        passLength--
    }
    println("Пароль: $password")
}