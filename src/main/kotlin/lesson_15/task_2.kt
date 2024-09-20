package org.example.lesson_15

fun main() {
    WeatherServer().apply {
        sendStats(Temperature())
        sendStats(PrecipitationAmount())
    }
}

abstract class WeatherStationStats()

class Temperature() : WeatherStationStats()

class PrecipitationAmount() : WeatherStationStats()

class WeatherServer() {

    fun sendStats(data: WeatherStationStats) {
        if (data is Temperature) println("Значение температуры успешно отправлено на сервер")
        else println("Показатели осадков успешно отправлены на сервер")
    }

}