package org.example.lesson_14

const val COLOR_BLACK = "black"
const val COLOR_WHITE = "white"

fun main() {
    val listOfFigure = listOf<Figure>(
        Circle(COLOR_BLACK, 15.0),
        Rectangle(COLOR_WHITE, 4.0, 6.0),
        Circle(COLOR_WHITE, 12.0),
        Rectangle(COLOR_WHITE, 2.0, 6.0),
        Circle(COLOR_BLACK, 18.0),
        Rectangle(COLOR_WHITE, 14.0, 3.0),
        Circle(COLOR_BLACK, 15.0),
        Rectangle(COLOR_WHITE, 14.0, 6.0),
        Circle(COLOR_WHITE, 2.0),
        Rectangle(COLOR_WHITE, 4.0, 16.0),
    )
    listOfFigure.filter { figure -> figure.color == COLOR_BLACK }.sumOf { figure -> figure.getPerimeter() }.apply { println(this) }
    listOfFigure.filter { figure -> figure.color == COLOR_WHITE }.sumOf { figure -> figure.getArea() }.apply { println(this) }
}

abstract class Figure(val color: String) {

    abstract fun getArea(): Double

    abstract fun getPerimeter(): Double

}

class Circle(color: String, val radius: Double) : Figure(color) {

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }

    override fun getPerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun getArea(): Double {
        return width * height
    }

    override fun getPerimeter(): Double {
        return (width * 2) + (height * 2)
    }
}