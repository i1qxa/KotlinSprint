package org.example.lesson_21

fun main() {
    Player21("Lidiya", 5, 10).apply {
        println(isHealthy())
        currentHealth = 10
        println(isHealthy())
    }
}

class Player21(val name: String, var currentHealth: Int, val maxHealth: Int) {

    fun printHealthInfo() {
        println("$currentHealth/$maxHealth")
    }

}

fun Player21.isHealthy(): Boolean = this.currentHealth == this.maxHealth