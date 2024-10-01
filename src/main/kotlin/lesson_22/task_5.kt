package org.example.lesson_22

fun main() {

    GalacticGuide("Alpha Centauri",
        "В Путеводитель для путешествующих автостопом по Галактике добавляется информация о месте или событии в галактике в виде объектов.",
        "17.02.2589 19:33",
        133433
    ).apply {
        println("Название места: ${component1()}")
        println("Описание: ${component2()}")
        println("Дата и время: ${component3()}")
        println("Расстояние в световых годах: ${component4()}")
    }

}


data class GalacticGuide(
    val name:String,
    val description:String,
    val date: String,
    val distance:Long,
)

