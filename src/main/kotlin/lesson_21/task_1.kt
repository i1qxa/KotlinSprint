package org.example.lesson_21

import java.util.*

fun main() {
    println("hello".vowelCount())
}

fun String.vowelCount(): Int {
    val vowelRegex = "[aeiouy]".toRegex()
    return this.count { vowelRegex.containsMatchIn(it.toString().lowercase(Locale.getDefault())) }
}