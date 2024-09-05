package org.example.lesson_7

import kotlin.random.Random

fun main() {
    var pass = ""
    val alphabet = 'a'..'z'
    var counter = 0
    while (counter<3) {
        pass += alphabet.random()
        pass += Random.nextInt(10)
        counter++
    }
    println(pass)
}