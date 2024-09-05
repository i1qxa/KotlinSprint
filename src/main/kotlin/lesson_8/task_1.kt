package org.example.lesson_8

fun main() {
    val watchArray = intArrayOf(25, 75, 15, 65, 95, 5, 125)
    var totalWatchAmount = 0
    watchArray.map {
        totalWatchAmount += it
    }
    println("Всего просмотров за неделю: $totalWatchAmount")
}