package org.example.lesson_12

fun main(){
    val mondayWeather = WeatherData()
    val sundayWeather = WeatherData()
    mondayWeather.printWeatherData()
    sundayWeather.printWeatherData()
    with(mondayWeather){
        dayTemp = 25
        nightTemp = 9
        isPrecipitation = true
    }
    with(sundayWeather){
        dayTemp = 35
        nightTemp = 19
        isPrecipitation = false
    }
    mondayWeather.printWeatherData()
    sundayWeather.printWeatherData()
}

class WeatherData{
    var dayTemp = 20
    var nightTemp = 10
    var isPrecipitation = false

    fun printWeatherData(){
        println("Температура днём:$dayTemp. Температура ночью:$nightTemp. ${getPrecipitationAsString()}")
    }

    private fun getPrecipitationAsString():String = if (isPrecipitation) "Были осадки" else "Осадков не было"

}