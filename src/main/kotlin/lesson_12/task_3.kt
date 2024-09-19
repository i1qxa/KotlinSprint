package org.example.lesson_12

const val DIFFERENT_BETWEEN_KELVIN_AND_CELSIUS2 = 273

fun main() {
    val weather = WeatherData6(11, 2, true)
    weather.printWeatherData()
}

class WeatherData6(_dayTempK: Int, _nightTempK: Int, _isPrecipitation: Boolean) {

    val dayTempC = _dayTempK - DIFFERENT_BETWEEN_KELVIN_AND_CELSIUS2
    val nightTempC = _nightTempK - DIFFERENT_BETWEEN_KELVIN_AND_CELSIUS2
    val isPrecipitation = _isPrecipitation

    fun printWeatherData() {
        println("Температура днём:$dayTempC. Температура ночью:$nightTempC. ${getPrecipitationAsString()}")
    }

    private fun getPrecipitationAsString(): String = if (isPrecipitation) "Были осадки." else "Осадков не было."

}