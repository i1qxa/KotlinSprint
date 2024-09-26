package org.example.lesson_20

fun main() {

    val listOfButtons = mutableListOf<String>("Help", "Submit", "Apply", "Cancel", "Abort", "Finish", "Begin")
    listOfButtons.map {
        if (listOfButtons.indexOf(it) % 2 == 0) {
            { println("Нажат элемент: $it") }()
        } else {
            it
        }
    }
}