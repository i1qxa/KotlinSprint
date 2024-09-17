package org.example.lesson_12

fun main() {
    val mondayWeather = MyWeatherData(25, 12, true)
    mondayWeather.printWeatherData()
}

class MyWeatherData(
    val dayTemp: Int,
    var nightTemp: Int,
    var isPrecipitation: Boolean,
) {

    fun printWeatherData() {
        println("Температура днём:$dayTemp. Температура ночью:$nightTemp. ${getPrecipitationAsString()}")
    }

    private fun getPrecipitationAsString(): String = if (isPrecipitation) "Были осадки." else "Осадков не было."

}