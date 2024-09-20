package org.example.lesson_14

fun main() {
    val victoria = LinearShip2("Victoria")
    victoria.loadingMethod()
    val karl = CargoShip2("Karl")
    karl.loadingMethod()
    val harald = IceBoat2("Harald")
    harald.loadingMethod()
}

open class LinearShip2(
    val name: String,
    val speed: Int = 10,
    val carrying: Int = 100,
    val passengerAmount: Int = 100,
) {
    open fun loadingMethod() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip2(
    name: String,
    speed: Int = 7,
    carrying: Int = 300,
    passengerAmount: Int = 0,
) : LinearShip2(name, speed, carrying, passengerAmount) {
    override fun loadingMethod() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class IceBoat2(
    name: String,
    speed: Int = 5,
    carrying: Int = 50,
    passengerAmount: Int = 0,
    val canBreakIce: Boolean = true
) : LinearShip2(name, speed, carrying, passengerAmount) {
    override fun loadingMethod() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}

