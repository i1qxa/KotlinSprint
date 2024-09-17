package org.example.lesson_11

fun main() {
    val user1 = User6(
        1,
        "user",
        "1234",
        "asdsad@gmail.com"
    )
    with(user1) {
        updateBio()
        updatePass()
        printUserInfo()
    }
}

class User6(
    val id: Int,
    val login: String,
    var pass: String,
    val email: String,
    var bio: String? = null,
) {

    fun printUserInfo() {
        println(this)
    }

    fun updateBio() {
        println("Укажите информацию о пользователе")
        bio = readln()
    }

    fun updatePass() {
        do {
            println("Введите текущий пароль")
        } while (readln() != pass)
        println("Введите новый пароль")
        pass = readln()
        println("Пароль успешно изменен")
    }

    override fun toString(): String {
        return "id:$id, login:$login, pass:$pass, email:$email, bio:$bio"
    }
}