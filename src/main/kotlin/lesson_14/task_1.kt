package org.example.lesson_14

fun main() {
    val victoria = LinearShip("Victoria")
    val karl = CargoShip("Karl")
    val harald = IceBoat("Harald")
}

open class LinearShip(
    val name: String,
    val speed: Int = 10,
    val carrying: Int = 100,
    val passengerAmount: Int = 100,
)

class CargoShip(
    name: String,
    speed: Int = 7,
    carrying: Int = 300,
    passengerAmount: Int = 0,
) : LinearShip(name, speed, carrying, passengerAmount)

class IceBoat(
    name: String,
    speed: Int = 5,
    carrying: Int = 50,
    passengerAmount: Int = 0,
    val canBreakIce: Boolean = true
) : LinearShip(name, speed, carrying, passengerAmount)

