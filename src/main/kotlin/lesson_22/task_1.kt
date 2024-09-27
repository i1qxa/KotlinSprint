package org.example.lesson_22

//Обычные классы не равны т.к. сравнение происходит по ссылке.
//Дата классы равны т.к. сравнение происходит по полям класса

fun main() {

    val rb1 = RegularBook("Dark Tower", "King")
    val rb2 = RegularBook("Dark Tower", "King")
    val db1 = DataBook("Dark Tower", "King")
    val db2 = DataBook("Dark Tower", "King")

    println("RegularBook ${rb1 == rb2}")
    println("DataBook ${db1 == db2}")

}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)