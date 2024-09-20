package org.example.lesson_15

fun main() {
    CrucianCarp().float()
    Seagull().fly()
    Duck().apply {
        float()
        fly()
    }
}

interface Floating {

    fun float() {
        println("Я могу плавать")
    }

}

interface Flying {

    fun fly() {
        println("Я могу летать")
    }

}

class CrucianCarp() : Floating

class Seagull() : Flying

class Duck() : Flying, Floating