package org.example.lesson_18

fun main() {

    Order().apply {
        printOrderInfo(1, "Milk")
    }
    Order().apply {
        printOrderInfo(2, listOf("Milk", "Avocado", "Bananas"))
    }

}

class Order() {

    fun printOrderInfo(id: Int, goods: String) {

        println("Заказан товар:$goods")

    }

    fun printOrderInfo(id: Int, goods: List<String>) {

        println("Заказаны следующие товары:$goods")

    }

}
