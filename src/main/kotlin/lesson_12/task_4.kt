package org.example.lesson_12

const val DIFFERENT_BETWEEN_KELVIN_AND_CELSIUS = 273

fun main() {
    val weather = WeatherData1(300, 289, true)
}

class WeatherData1(_dayTempK: Int, _nightTempK: Int, _isPrecipitation: Boolean) {

    val dayTempC = _dayTempK - DIFFERENT_BETWEEN_KELVIN_AND_CELSIUS
    val nightTempC = _nightTempK - DIFFERENT_BETWEEN_KELVIN_AND_CELSIUS
    val isPrecipitation = _isPrecipitation

    init {
        printWeatherData()
    }

    fun printWeatherData() {
        println("Температура днём:$dayTempC. Температура ночью:$nightTempC. ${getPrecipitationAsString()}")
    }

    private fun getPrecipitationAsString(): String = if (isPrecipitation) "Были осадки." else "Осадков не было."

}