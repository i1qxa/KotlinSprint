package org.example.lesson_12

import kotlin.random.Random

const val DIFFERENT_BETWEEN_KELVIN_AND_CELSIUS = 273

fun main() {

    val monthWeatherList = mutableListOf<WeatherData2>()
    val monthDayTemperatureList = mutableListOf<Int>()
    val monthNightTemperatureList = mutableListOf<Int>()
    val precipitationDayList = mutableListOf<WeatherData2>()
    repeat(30) {
        val dayWeatherData = WeatherData2(getRandomDayTemperature(), getRandomNightTemperature(), Random.nextBoolean())
        monthWeatherList.add(dayWeatherData)
        monthDayTemperatureList.add(dayWeatherData.dayTempC)
        monthNightTemperatureList.add(dayWeatherData.nightTempC)
        if (dayWeatherData.isPrecipitation) precipitationDayList.add(dayWeatherData)
    }
    println("Средняя дневная температура за 30 дней: ${monthDayTemperatureList.average().toInt()}")
    println("Средняя ночная температура за 30 дней: ${monthNightTemperatureList.average().toInt()}")
    println("За период 30 дней, дней с осадками было: ${precipitationDayList.size}")

}

private fun getRandomDayTemperature(): Int = 293 + Random.nextInt(10)

private fun getRandomNightTemperature(): Int = 283 + Random.nextInt(10)

class WeatherData2(_dayTempK: Int, _nightTempK: Int, _isPrecipitation: Boolean) {

    val dayTempC = _dayTempK - DIFFERENT_BETWEEN_KELVIN_AND_CELSIUS
    val nightTempC = _nightTempK - DIFFERENT_BETWEEN_KELVIN_AND_CELSIUS
    val isPrecipitation = _isPrecipitation

    fun printWeatherData() {
        println("Температура днём:$dayTempC. Температура ночью:$nightTempC. ${getPrecipitationAsString()}")
    }

    private fun getPrecipitationAsString(): String = if (isPrecipitation) "Были осадки." else "Осадков не было."

}