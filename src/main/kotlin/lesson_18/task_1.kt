package org.example.lesson_18

fun main() {

    Order(1, "Milk").apply {
        printOrderInfo(this)
    }
    OrderGoodsList(2, listOf("Potato", "Milk", "Orange")).apply {
        printOrderInfo(this)
    }

}

class Order(val id:Int, val goods:String)

class OrderGoodsList(val id:Int, val goods:List<String>)

fun printOrderInfo(order:Order){

    println("Заказан товар:${order.goods}")

}

fun printOrderInfo(order:OrderGoodsList){

    println("Заказаны следующие товары:${order.goods}")

}