package org.example.lesson_15

fun main() {
    MusicalInstrument(1, "Гитара", 10, 10).apply {
        findComponentsByInstrumentToolType(this.instrumentType)
    }
}

abstract class MusicShopItem(val id: Int, val name: String, val stockAmount: Int)

class MusicalInstrument(id: Int, name: String, stockAmount: Int, val instrumentType: Int) :
    MusicShopItem(id, name, stockAmount), SearchComponents {
    override fun findComponentsByInstrumentToolType(toolType: Int) {
        println("Выполняется поиск...")
    }
}

class Components(id: Int, name: String, stockAmount: Int, availableToolTypes: List<Int>) :
    MusicShopItem(id, name, stockAmount)

interface SearchComponents {
    fun findComponentsByInstrumentToolType(toolType: Int)
}
