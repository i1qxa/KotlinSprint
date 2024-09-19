package org.example.lesson_14

fun main() {
    Planet(
        "Mars", true, false, listOf(
            Satellite("Deimos", false, false),
            Satellite("Fobos", false, false)
        )
    ).run {
        printCelestialBodyName()
        printListOfSatellites()
    }
}

abstract class CelestialBody(
    val name: String,
    val isAtmosphereExist: Boolean,
    val isSuitableForLanding: Boolean,
) {
    abstract fun printCelestialBodyName()
}

class Satellite(name: String, isAtmosphereExist: Boolean, isSuitableForLanding: Boolean) :
    CelestialBody(name, isAtmosphereExist, isSuitableForLanding){
    override fun printCelestialBodyName() {
        println("Название спутника: $name")
    }
}

class Planet(
    name: String,
    isAtmosphereExist: Boolean,
    isSuitableForLanding: Boolean,
    val listOfSatellite: List<Satellite>?
) : CelestialBody(name, isAtmosphereExist, isSuitableForLanding) {

    override fun printCelestialBodyName() {
        println("Название планеты: $name")
    }

    fun printListOfSatellites() {
        listOfSatellite?.let { satelliteList ->
            satelliteList.forEach { satellite ->
                satellite.printCelestialBodyName()
            }
        }
    }
}