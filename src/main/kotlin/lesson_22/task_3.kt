package org.example.lesson_22

fun main() {
    val (id, name, smth) = Sample(1, "Igor", 1F)
    println("id:$id\nname:$name\nsmth:$smth")
}

data class Sample(val id: Int, val name: String, val smth: Float)