package org.example.lesson_21

fun main() {
    println(mapOf(("power" to 10), ("health" to 30), ("speed" to 7)).maxCategory())
}

fun Map<String, Int>.maxCategory(): String? = this.maxByOrNull { it.value }?.key