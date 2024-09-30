package org.example.lesson_22

//В случае обычного класса, метод toString() возвращает ссылку на объект в текстовом формате
//А в случае data класса метод toString() имеет реализацию по умолчанию, выводящую поля класса в читаемом для человека виде

fun main() {
    RegularBook2("Anna", "Tolstoy").apply {
        println(this)
    }
    DataBook2("Anna", "Tolstoy").apply {
        println(this)
    }
}

class RegularBook2(val name: String, val author: String)

data class DataBook2(val name: String, val author: String)