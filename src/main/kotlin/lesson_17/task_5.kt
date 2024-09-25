package org.example.lesson_17

fun main() {
    User("Nick", "1234567").apply {
        pass = "123"
        println(pass)
        login = "Admin"
    }
}

class User(login:String, pass:String){

    var pass = pass
        get() = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль")

    var login = login
        set(value){
            field = value
            println("Логин успешно изменен")
        }

}