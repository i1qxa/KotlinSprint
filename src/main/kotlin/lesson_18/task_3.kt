package org.example.lesson_18

fun main() {

    listOf<Animals>(Fox(), Dog(), Cat()).forEach { animals ->
        animals.eat()
    }

}

abstract class Animals() {

    abstract fun sleep()
    abstract fun eat()

}

class Fox() : Animals() {

    override fun sleep() {
        println("Лиса спит")
    }

    override fun eat() {
        println("Лиса ест ягоды")
    }
}

class Dog() : Animals() {

    override fun sleep() {
        println("Собака спит")
    }

    override fun eat() {
        println("Собака ест кости")
    }
}

class Cat() : Animals() {

    override fun sleep() {
        println("Кошка спит")
    }

    override fun eat() {
        println("Кошка ест рыбу")
    }
}