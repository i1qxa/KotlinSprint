package org.example.lesson_20

fun main() {

    val checkKey = { player: PlayerWithKey ->
        if (player.isKeyExist) println("${player.name} открыл дверь")
        else println("Дверь заперта")
    }
    PlayerWithKey("John", true).apply {
        checkKey(this)
    }
    PlayerWithKey("Alen", false).apply {
        checkKey(this)
    }

}

class PlayerWithKey(val name: String, val isKeyExist: Boolean)