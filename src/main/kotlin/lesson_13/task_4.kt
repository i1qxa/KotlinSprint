package org.example.lesson_13

fun main() {
    val contactList = mutableListOf<Contact4>()
    var shouldAddContact = true
    do {
        val contact = createContact4()
        if (contact != null) contactList.add(contact)
        else println("Контакт не был добавлен так как вы не указали номер телефона")
        println("Добавить ещё один контакт? Да/Нет")
        if (readln().lowercase() == "нет") shouldAddContact = false
    } while (shouldAddContact)
    contactList.forEach {
        it.printContactInfo()
    }
}

fun createContact4(): Contact4? {
    println("Введите имя")
    val name = readln()
    println("Введите номер телефона")
    val phoneNumber = readln().toLongOrNull()
    println("Введите компанию")
    val company = readln().ifEmpty { null }
    return if (phoneNumber != null) Contact4(phoneNumber, name, company) else null
}

class Contact4(
    val phoneNumber: Long,
    val name: String,
    val company: String? = null,
) {
    fun printContactInfo() {
        println("\n-Имя:$name\n-Номер:$phoneNumber\n-Компания:${company ?: "не указано"}")
    }
}