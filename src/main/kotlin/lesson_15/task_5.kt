package org.example.lesson_15

const val TRUCK_CARGO_CAPACITY = 2
const val TRUCK_PASSENGER_CAPACITY = 1
const val CAR_PASSENGER_CAPACITY = 3

fun main() {
    println("Грузовой автомобиль______________________")
    Truck(1, 7, -12).apply {
        cargoAmount?.let {
            var cargoLeft = it
            while (cargoLeft > 0) {
                cargoLeft -= this.transportCargo(cargoLeft)
            }
        }
        var passengerLeft = this.passengerAmount
        while (passengerLeft > 0) {
            passengerLeft -= this.transportPassenger(passengerLeft)
        }
    }
    println("Легковой автомобиль______________________")
    Car(2, 4).apply {
        var passengerLeft = this.passengerAmount
        while (passengerLeft > 0) {
            passengerLeft -= this.transportPassenger(passengerLeft)
        }
    }
}

abstract class Transport(
    val id: Int,
    val cargoAmount: Int?,
    val passengerAmount: Int,
)

interface TransportCargo {

    fun transportCargo(cargoWeight: Int): Int

}

interface TransportPassenger {

    fun transportPassenger(passengerAmount: Int): Int

}

class Truck(id: Int, cargoWeight: Int, passengerAmount: Int) :
    Transport(id, cargoWeight, passengerAmount),
    TransportCargo, TransportPassenger {

    override fun transportCargo(cargoWeight: Int): Int {
        if (cargoWeight <= 0) return 0
        val cargoTransported = if (cargoWeight >= TRUCK_CARGO_CAPACITY) TRUCK_CARGO_CAPACITY else cargoWeight
        println("Загружено: $cargoTransported тонн")
        println("Разгружено: $cargoTransported тонн")
        return cargoTransported
    }


    override fun transportPassenger(passengerAmount: Int): Int {
        if (passengerAmount <= 0) return 0
        val passengerTransported =
            if (passengerAmount >= TRUCK_PASSENGER_CAPACITY) TRUCK_PASSENGER_CAPACITY else passengerAmount
        println("Сели: $passengerTransported пассажиров")
        println("Вышли: $passengerTransported пассажиров")
        return passengerTransported
    }

}

class Car(id: Int, passengerAmount: Int) :
    Transport(id, null, passengerAmount), TransportPassenger {

    override fun transportPassenger(passengerAmount: Int): Int {
        if (passengerAmount < 0) return 0
        val passengerTransported =
            if (passengerAmount >= CAR_PASSENGER_CAPACITY) CAR_PASSENGER_CAPACITY else passengerAmount
        println("Сели: $passengerTransported пассажиров")
        println("Вышли: $passengerTransported пассажиров")
        return passengerTransported
    }

}