package org.example.lesson_21

import java.io.File
import java.io.IOException

fun main() {
    File("test.txt").apply {
        writeText("Hello World!")
        println(this.readText())
        appendTextInLowerCase("Santa say: ")
        println(this.readText())
    }
}

fun File.appendTextInLowerCase(text: String) {
    try {
        val content = text.lowercase() + this.readText()
        this.writeText(content)
    } catch (e: IOException) {
        throw RuntimeException("Ошибка записи в файл", e)
    }
}