package org.example.lesson_19

fun main() {
    val listOfHumans = mutableListOf<Human>()
    println("Введите имя и пол человека. Пол может быть: Мужской, Жениский, Не указан.\nИмя и пол разделяются пробелом.\nЧтобы указать мужской пол введите\"0\"\nЧтобы указать женский пол введите\"1\"")
    repeat(5) {
        readln().split(" ").apply {
            val name = try {
                this[0]
            } catch (e: Exception) {
                "Имя не указано"
            }
            val gender = try {
                when (this[1].toInt()) {
                    0 -> Gender.MALE
                    1 -> Gender.FEMALE
                    else -> Gender.NOT_SPECIFIED
                }
            } catch (e: Exception) {
                Gender.NOT_SPECIFIED
            }
            listOfHumans.add(Human(name, gender))
        }
    }
    listOfHumans.forEach { human ->
        println(human.toString())
    }
}

class Human(val name: String, val gender: Gender) {
    override fun toString(): String {
        return "Имя: ${name.ifEmpty { "Не указано" }}. Пол: ${gender.getString()}"
    }
}

enum class Gender() {
    MALE {
        override fun getString(): String {
            return "Мужской"
        }
    },
    FEMALE {
        override fun getString(): String {
            return "Женский"
        }
    },
    NOT_SPECIFIED {
        override fun getString(): String {
            return "Не указан"
        }
    }
    ;

    abstract fun getString(): String
}