package org.example.lesson_20

fun main() {

    val greetingMsg = { userName: String ->
        "С наступающим Новым Годом, $userName"
    }

    println(greetingMsg("Anna"))
}
