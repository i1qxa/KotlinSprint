package org.example.lesson_14

fun main() {
    Chat().apply{
        addMessage(Message(1,"Булгаков", "Привет всем"))
        addMessage(Message(2,"Гоголь", "Привет!"))
        addMessage(Message(3,"Толстой", "Добрый день!"))
        addMessage(Message(4,"Бродский", "Хой"))
        addThreadMessage(ChildMessage(5,"Бродский", "Как у вас погода?", 1))
        addThreadMessage(ChildMessage(6,"Булгаков", "Сегодня весь день идёт дождь((", 1))
        addThreadMessage(ChildMessage(7,"Толстой", "Ты когда к нам в гости?", 2))
        addThreadMessage(ChildMessage(8,"Гоголь", "На следующей неделе.", 2))
        addThreadMessage(ChildMessage(7,"Толстой", "Ок, ждёмс", 2))
        printChat()
    }
}

class Chat(val messageList: MutableList<Message> = mutableListOf()) {
    fun addMessage(message: Message) {
        messageList.add(message)
    }

    fun addThreadMessage(childMessage: ChildMessage) {
        messageList.add(childMessage)
    }

    fun printChat() {
        messageList.groupBy { message -> if (message is ChildMessage) message.parentMessageId else message.id }.forEach { threadList ->
            threadList.value.forEach { message ->
                message.printMessage()
            }
        }
    }
}

open class Message(val id: Int, val author: String, val message: String) {
    open fun printMessage() {
        println("$author: $message")
    }
}

class ChildMessage(id: Int, author: String, message: String, val parentMessageId: Int) : Message(id, author, message) {
    override fun printMessage() {
        println("\t$author: $message")
    }
}