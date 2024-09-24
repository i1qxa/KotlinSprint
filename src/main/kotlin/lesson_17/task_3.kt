package org.example.lesson_17

fun main() {
    Folder("Загрузки", 22, true).apply {
        println("Название:$name\nКоличество файлов:$filesAmount")
    }
}

class Folder(name:String, filesAmount:Int, val isHide:Boolean){

    val name = name
        get() = if (isHide) "Скрытая папка" else field

    val filesAmount = filesAmount
        get() = if (isHide) 0 else field

}