package org.example.lesson_16

fun main() {
    val admin = User("admin", "1234")
    admin.validatePass("1234")
}

class User(val login: String, private val pass: String) {

    fun validatePass(passInput: String): Boolean {

        if (passInput == pass) {
            println("Пароль введен верно")
            return true
        } else {
            println("Неправильный пароль")
            return false
        }

    }

}