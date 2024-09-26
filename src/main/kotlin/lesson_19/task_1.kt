package org.example.lesson_19

fun main() {
    println("Вы можете добавить в свой аквариум следующие виды рыб")
    println(FISH.entries)
}

enum class FISH {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}