package org.example.lesson_15

fun main() {
    WeatherServer().apply {
        sendStats(Temperature(32))
        sendStats(PrecipitationAmount(12))
    }
}

abstract class WeatherStationStats()

class Temperature(val temperature: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitationAmount: Int) : WeatherStationStats()

class WeatherServer() {

    fun sendStats(data: WeatherStationStats) {
        when (data) {
            is Temperature -> println("Значение температуры успешно отправлено на сервер")
            is PrecipitationAmount -> println("Показатели осадков успешно отправлены на сервер")
            else -> println("Ошибка, неизвестные показатели!")
        }
    }
}