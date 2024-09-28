package org.example.lesson_18

abstract class Figure()

class Dot() : Figure()

class Circle() : Figure()

class Rectangle() : Figure()

class Screen() {

    fun drawFigure(x: Int, y: Int, figure: Figure) {
        when (figure) {
            is Dot -> {
                println("Точка. Координаты - целочисленные")
            }

            is Circle -> {
                println("Круг. Координаты - целочисленные")
            }

            is Rectangle -> {
                println("Прямоугольник. Координаты - целочисленные")
            }

            else -> {
                println("Ошибка. Неизвестная фигура")
            }
        }
    }

    fun drawFigure(x: Float, y: Float, figure: Figure) {
        when (figure) {
            is Dot -> {
                println("Точка. Координаты - с плавающей точкой")
            }

            is Circle -> {
                println("Круг. Координаты - с плавающей точкой")
            }

            is Rectangle -> {
                println("Прямоугольник. Координаты - с плавающей точкой")
            }

            else -> {
                println("Ошибка. Неизвестная фигура")
            }
        }
    }

}