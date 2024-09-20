package org.example.lesson_15

fun main(){
    User(
        id = 1,
        name = "TODO()"
    ).apply {
        readForum()
        writeMsg("asdasd")
    }
    Administrator(
        id = 2,
        name = "Admin"
    ).apply {
        readForum()
        writeMsg("123123123")
        removeMsg(2)
    }
}

abstract class Users(val id:Int, val name:String){

    open fun readForum(){
        println("Пользователь:$name прочитал форум")
    }

    open fun writeMsg(msg:String){
        println("Пользователь:$name написал ${msg} ")
    }

}

class User(id: Int, name: String):Users(id, name)

class Administrator(id: Int, name: String):Users(id, name){

    fun removeMsg(messageId:Int){
        println("Сообщение удалено")
    }

}