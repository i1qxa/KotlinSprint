package org.example.lesson_11

fun main() {
    val user1 = User7(
        1,
        "user",
        "1234",
        "asdsad@gmail.com"
    )
    val user2 = User7(
        2,
        "admin",
        "0000",
        "cvbcxvb@gmail.com"
    )
    println("User1: $user1")
    println("User2: $user2")
}

class User7(
    val id: Int,
    val login: String,
    val pass: String,
    val email: String,
) {
    override fun toString(): String {
        return "id:$id, login:$login, pass:$pass, email:$email"
    }
}