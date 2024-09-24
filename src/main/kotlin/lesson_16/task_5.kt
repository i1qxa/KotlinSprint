package org.example.lesson_16

fun main() {
    Player("Ololosh", 10, 6).apply {
        getDamage()
        getDamage()
        heal()
        getDamage()
        getDamage()
        getDamage()
        heal()
    }
}

class Player(
    val name: String,
    private var healthPoint: Int,
    var hitPower: Int,
) {

    fun heal() {
        if (healthPoint <= 0) {
            println("Невозможно вылечить погибшего игрока")
            return
        }
        healthPoint += 5
        println("Игрок вылечился на 5ед. Текущее здоровье: $healthPoint")
    }

    fun getDamage() {
        if (healthPoint <= 0) {
            println("Невозможно нанести урон уже погибшему игроку")
            return
        }
        healthPoint -= 4
        if (healthPoint <= 0) {
            playerDie()
            println("Игрок получил 4ед урона. Игрок погибает")
        } else {
            println("Игрок получил 4ед урона. Текущее здоровье: $healthPoint")
        }
    }

    private fun playerDie(){
        healthPoint = 0
        hitPower = 0
    }

}