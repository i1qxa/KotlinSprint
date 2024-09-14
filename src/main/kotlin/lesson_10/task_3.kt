package org.example.lesson_10

import kotlin.random.Random

fun main() {
    println("Введите длину пароля")
    val passLength = readln().toInt()
    val pass = generatePass(passLength)
    println("Ваш пароль: $pass")
}

fun generatePass(passLength:Int):String{
    val pass = StringBuilder()
    var counter = 0
    while (counter < passLength) {
        pass.append(Random.nextInt(10))
        counter++
        if (counter < passLength) {
            pass.append(" !\"#\$%&'()*+,-./".random())
            counter++
        }
    }
    return pass.toString()
}