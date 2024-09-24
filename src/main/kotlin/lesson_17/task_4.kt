package org.example.lesson_17

fun main() {
    Package(10).apply {
        currentLocation = "London"
        currentLocation = "Liverpool"
        currentLocation = "Paris"
        currentLocation = "Madrid"
    }
}

class Package(val packageNumber:Int){

    var transportAmount = 0
    var currentLocation:String = ""
        set(value) {
            field = value
            transportAmount++
            println("Новая локация:$field. Количество перемещений:$transportAmount")
        }
}