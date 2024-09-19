package org.example.lesson_13

fun main() {
    val contactList = listOf(
        Contact3(89123456789, "Ростислав", "Сбербанк"),
        Contact3(89126556789, "Никифор", null),
        Contact3(89123456129, "Сигизмунд", "null"),
        Contact3(89123456359, "Никонор", "Рога и Копыта"),
        Contact3(89123456009, "Агафья", null)

    )
    contactList.filter { contact -> contact.company!=null }.forEach { contact ->
        println(contact.company)
    }
}

class Contact3(
    val phoneNumber: Long,
    val name: String,
    val company: String? = null,
) {
    fun printContactInfo() {
        println("\n-Имя:$name\n-Номер:$phoneNumber\n-Компания:${company ?: "не указано"}")
    }
}