package org.example.lesson_15

const val TRUCK_CARGO_CAPACITY = 2
const val TRUCK_PASSENGER_CAPACITY = 1
const val CAR_PASSENGER_CAPACITY = 3

fun main() {
    println("Грузовой автомобиль______________________")
    Truck(1, 6, 2).apply {
        transportCargo()
        transportPassenger()
    }
    println("Легковой автомобиль______________________")
    Car(2, 4).transportPassenger()
}

abstract class Transport(
    val id: Int,
    val cargoAmount: Int?,
    val passengerAmount: Int,
)

interface TransportCargo {

    fun transportCargo()

    fun loadCargo(cargoWeight: Int): Int

    fun unloadCargo(cargoWeight: Int)
}

interface TransportPassenger {

    fun transportPassenger()

    fun loadPassenger(passengerAmount: Int): Int

    fun unloadPassenger(passengerAmount: Int)

}

class Truck(id: Int, cargoAmount: Int?, passengerAmount: Int) :
    Transport(id, cargoAmount, passengerAmount),
    TransportCargo, TransportPassenger {
    override fun transportCargo() {
        cargoAmount?.let { cargoAmount ->
            var cargoLeft = cargoAmount
            do {
                loadCargo(cargoLeft).also { cargoTransported ->
                    unloadCargo(cargoTransported)
                    cargoLeft -= cargoTransported
                }
            } while (cargoLeft > 0)
        }
    }

    override fun loadCargo(cargoWeight: Int): Int {
        val cargoTransported =
            if (cargoWeight > TRUCK_CARGO_CAPACITY) TRUCK_CARGO_CAPACITY else cargoWeight
        println("Загружено: $cargoTransported тонн")
        return cargoTransported
    }

    override fun unloadCargo(cargoWeight: Int) {
        println("Разгружено: $cargoWeight тонн")
    }

    override fun transportPassenger() {
        var passengerLeft = passengerAmount
        do {
            loadPassenger(passengerLeft).also { passengerTransported ->
                passengerLeft -= passengerTransported
                unloadPassenger(passengerTransported)
            }
        } while (passengerLeft > 0)
    }

    override fun loadPassenger(passengerAmount: Int): Int {
        val passengerTransported =
            if (passengerAmount > TRUCK_PASSENGER_CAPACITY) TRUCK_PASSENGER_CAPACITY else passengerAmount
        println("Сели: $passengerTransported пассажиров")
        return passengerTransported
    }

    override fun unloadPassenger(passengerAmount: Int) {
        println("Вышли: $passengerAmount пассажиров")
    }
}

class Car(id: Int, passengerAmount: Int) :
    Transport(id, null, passengerAmount), TransportPassenger {
    override fun transportPassenger() {
        var passengerLeft = passengerAmount
        do {
            loadPassenger(passengerLeft).also { passengerTransported ->
                passengerLeft -= passengerTransported
                unloadPassenger(passengerTransported)
            }
        } while (passengerLeft > 0)
    }

    override fun loadPassenger(passengerAmount: Int): Int {
        val passengerTransported =
            if (passengerAmount > CAR_PASSENGER_CAPACITY) CAR_PASSENGER_CAPACITY else passengerAmount
        println("Сели: $passengerTransported пассажиров")
        return passengerTransported
    }

    override fun unloadPassenger(passengerAmount: Int) {
        println("Вышли: $passengerAmount пассажиров")
    }
}