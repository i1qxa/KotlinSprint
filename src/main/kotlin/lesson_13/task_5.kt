package org.example.lesson_13

fun main() {
    createContact()
}

fun createContact() {
    println("Введите имя")
    val name = readln()
    println("Введите номер телефона")
    val phoneNumber = try {
        readln().toLong()
    } catch (e:Exception){
        println(e.toString())
    }
    println("Введите компанию")
    val company = readln().ifEmpty { null }
}

class Contact5(
    val phoneNumber: Long,
    val name: String,
    val company: String? = null,
) {
    fun printContactInfo() {
        println("\n-Имя:$name\n-Номер:$phoneNumber\n-Компания:${company ?: "не указано"}")
    }
}