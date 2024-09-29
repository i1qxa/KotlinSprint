package org.example.lesson_21

fun main() {
    println("hello".vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = "aeiouy"
    return this.count { it in vowels }
}