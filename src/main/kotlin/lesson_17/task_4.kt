package org.example.lesson_17

fun main() {
    Package(10, "Bobruisk").apply {
        currentLocation = "London"
        currentLocation = "Liverpool"
        currentLocation = "Paris"
        currentLocation = "Madrid"
    }
}

class Package(val packageNumber: Int, location: String) {

    var transportAmount = 0
    var currentLocation: String = location
        set(value) {
            field = value
            transportAmount++
            println("Новая локация:$field. Количество перемещений:$transportAmount")
        }
}