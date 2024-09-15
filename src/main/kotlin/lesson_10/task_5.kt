package org.example.lesson_10

const val LOGIN = "admin"
const val PASS = "1234"

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val pass = readln()
    val token = validateCreds(login, pass)
    if (token==null) println("Логин или пароль не верны")
    else {
        val shoppingCart = getShoppingCart(token)
        println(shoppingCart.joinToString(", "))
    }
}

fun validateCreds(login:String, pass:String):String? {
    return if (login == LOGIN && pass == PASS) generateToken() else null
}

fun generateToken():String {
    val token = StringBuilder()
    repeat(32) {
        token.append(((0..9) + ('a' .. 'z')).random())
    }
    return token.toString()
}

fun getShoppingCart(token:String):List<String> = listOf("Мыло", "Гель для душа", "Зубная паста", "Подгузники")