package org.example.lesson_19

fun main() {
    Tank().apply {
        shoot()
        loadCartridge(Cartridge.BLUE)
        shoot()
        shoot()
        loadCartridge(Cartridge.RED)
        shoot()
    }
}

class Tank() {

    var cartridgeLoaded: Cartridge? = null

    fun loadCartridge(cartridge: Cartridge) {
        cartridgeLoaded = cartridge
    }

    fun shoot() {
        try {
            println("Танк наносит ${cartridgeLoaded!!.power} урона")
            cartridgeLoaded = null
        } catch (e: NullPointerException) {
            println("Танк не может стрелять. Сначала зарядите снаряд")
        }
    }
}

enum class Cartridge(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}