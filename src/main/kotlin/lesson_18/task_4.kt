package org.example.lesson_18

abstract class Package() {

    abstract fun getArea(): Double

}

class RectanglePackage(val width: Double, val height: Double, val length: Double) : Package() {

    override fun getArea(): Double {
        return (width * length) * 2 + (height * length) * 2 + (width * height) * 2
    }
}

class CubePackage(val length: Double) : Package() {

    override fun getArea(): Double {
        return (length * 2) * 6
    }
}

