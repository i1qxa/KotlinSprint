package org.example.lesson_20

fun main() {

    val listOfButtons = mutableListOf<String>("Help", "Submit", "Apply", "Cancel", "Abort", "Finish", "Begin")
    listOfButtons.filter { listOfButtons.indexOf(it) % 2 != 0 }.map {
        println("Нажат элемент: $it")
    }
}