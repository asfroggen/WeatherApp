package com.esaudev.weatherapp.di

import com.esaudev.weatherapp.data.location.DefaultLocationTracker
import com.esaudev.weatherapp.data.repository.WeatherRepositoryImpl
import com.esaudev.weatherapp.domain.location.LocationTracker
import com.esaudev.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository

}