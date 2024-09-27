package org.example.lesson_20

const val HEAL_VALUE = 5

fun main() {

    val healPlayer = { player: Player ->
        if ((player.maxHealth - player.currentHealth)>HEAL_VALUE){
            player.currentHealth+=HEAL_VALUE
        }else{
            player.currentHealth = player.maxHealth
        }
    }

    with(Player("John", 15, 28)) {
        this.printHealthInfo()
        healPlayer(this)
        this.printHealthInfo()
        healPlayer(this)
        this.printHealthInfo()
        healPlayer(this)
        this.printHealthInfo()
        healPlayer(this)
        this.printHealthInfo()
        healPlayer(this)
    }

}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int){

    fun printHealthInfo(){
        println("$currentHealth/$maxHealth")
    }

}

