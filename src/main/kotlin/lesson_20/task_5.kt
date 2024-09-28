package org.example.lesson_20

fun main() {
    Robot().apply {
        say()
        setModifier { it.reversed() }
        say()
    }
}

class Robot() {

    private var modifier: ((String) -> String) = { it }
    val listOfPhrase = listOf<String>(
        "Привет, человек!",
        "Потеряна связь с холодильником.",
        "Низкий заряд батареи!",
        "Строительство звезды смерти успешно завершено!",
        "Пан-ки-хой, звонит в домофон!"
    )

    private fun getRandomPhrase(): String = listOfPhrase.random()
    fun setModifier(modifier: ((String) -> String)) {
        this.modifier = modifier
    }

    fun say() {
        println(modifier.invoke(getRandomPhrase()))
    }

}