package com.esaudev.weatherapp.domain.repository

import com.esaudev.weatherapp.domain.util.Resource
import com.esaudev.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>

}