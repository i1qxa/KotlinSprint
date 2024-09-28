package org.example.lesson_21

fun main() {
    println(listOf(1, 2, 3, 4, 5, 6).evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}