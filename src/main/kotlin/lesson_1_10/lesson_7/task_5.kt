package org.example.lesson_1_10.lesson_7

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
    val passwordList = mutableListOf<String>()
    passwordList.add(alphabet.random().toString())
    passwordList.add(alphabetUpper.random().toString())
    passwordList.add(digitInterval.random().toString())
    passLength -= 3
    while (passLength > 0) {
        passwordList.add(validCharacters.random().toString())
        passLength--
    }
    val pass = StringBuilder()
    passwordList.shuffle()
    passwordList.map {
        pass.append(it)
    }
    println("Пароль: $pass")
}