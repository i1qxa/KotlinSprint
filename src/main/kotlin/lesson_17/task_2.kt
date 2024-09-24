package org.example.lesson_17

fun main() {
    Ship("Беда", 10, "Атлантида").apply {
        printShipName()
        name = "Победа"
        printShipName()
    }
}

class Ship(name:String, var averageSpeed:Int, var port:String){
    var name:String = name
        set(value) {
            println("Невозможно изменить имя корабля")
        }
    fun printShipName() = println("Корабль называется:$name")
}