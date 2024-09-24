package org.example.lesson_16

fun main() {
    Circle(25.0).apply {
        printCircumference()
        printAreaCircle()
    }
}

class Circle(private val radius: Double) {

    private val pi = 3.14

    fun printCircumference() {
        println("Длина окружности: ${2 * pi * radius}")
    }

    fun printAreaCircle(){
        println("Площадь окружности: ${pi*radius*radius}")
    }

}