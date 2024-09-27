package org.example.lesson_22

fun main() {

    val (name, description, date, distance) = GalacticGuide("Alpha Centauri",
        "В Путеводитель для путешествующих автостопом по Галактике добавляется информация о месте или событии в галактике в виде объектов.",
        "17.02.2589 19:33",
        133433
    )
    println("Название места: $name")
    println("Описание: $description")
    println("Дата и время: $date")
    println("Расстояние в световых годах: $distance")
}


data class GalacticGuide(
    val name:String,
    val description:String,
    val date: String,
    val distance:Long,
)

