package org.example.lesson_7

import kotlin.random.Random

fun main(){
    val pass = StringBuilder()
    val alphabet = 'a'..'z'
    var lastSymbolIsDigit = false
    var counter = 0
    while (counter<6){
        pass.append(if (lastSymbolIsDigit) alphabet.random() else Random.nextInt(9))
        counter++
        lastSymbolIsDigit = !lastSymbolIsDigit
    }
    println(pass)
}