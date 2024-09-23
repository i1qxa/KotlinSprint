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

    fun float()

}

interface Flying {

    fun fly()

}

class CrucianCarp() : Floating {

    override fun float() {
        println("Я могу плавать")
    }
}

class Seagull() : Flying {
    override fun fly() {
        println("Я могу летать")
    }
}


class Duck() : Flying, Floating {
    override fun fly() {
        println("Я могу летать")
    }

    override fun float() {
        println("Я могу плавать")
    }
}