package org.example.lesson_18

abstract class Figure()

class Dot() : Figure()

class Circle() : Figure()

class Rectangle() : Figure()

class Screen() {

    fun drawFigure(x: Int, y: Int, figure: Figure) {

    }

    fun drawFigure(x: Float, y: Float, figure: Figure) {

    }

}