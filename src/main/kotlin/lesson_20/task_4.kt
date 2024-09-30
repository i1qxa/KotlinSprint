package org.example.lesson_20

fun main() {

    val listOfButtons = mutableListOf<String>("Help", "Submit", "Apply", "Cancel", "Abort", "Finish", "Begin")
    val lambdaList = listOfButtons.map {
        { println("Нажат элемент: $it") }
    }
    lambdaList.forEach {
        if (lambdaList.indexOf(it) % 2 != 0) it()
    }
}