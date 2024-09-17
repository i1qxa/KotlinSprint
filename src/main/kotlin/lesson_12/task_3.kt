package org.example.lesson_12

fun main(){
    val weather = WeatherData1(11,2,true)
    weather.printWeatherData()
}

class WeatherData1(_dayTemp: Int, _nightTemp: Int, _isPrecipitation: Boolean) {

    val dayTemp = _dayTemp
    val nightTemp = _nightTemp
    val isPrecipitation = _isPrecipitation

    fun printWeatherData() {
        println("Температура днём:$dayTemp. Температура ночью:$nightTemp. ${getPrecipitationAsString()}")
    }

    private fun getPrecipitationAsString(): String = if (isPrecipitation) "Были осадки." else "Осадков не было."

}