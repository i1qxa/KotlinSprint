package org.example.lesson_19

fun main() {
    println("Вы можете добавить в свой аквариум следующие виды рыб")
    println(Fish.entries)
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}