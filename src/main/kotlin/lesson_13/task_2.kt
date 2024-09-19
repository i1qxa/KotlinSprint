package org.example.lesson_13

fun main() {
    val contact = Contact2(89123456789, "Ростислав")
    contact.printContactInfo()
}

class Contact2(
    val phoneNumber: Long,
    val name: String,
    val company: String? = null,
) {
    fun printContactInfo(){
        println("-Имя:$name\n-Номер:$phoneNumber\n-Компания:${company?:"не указано"}")
    }
}