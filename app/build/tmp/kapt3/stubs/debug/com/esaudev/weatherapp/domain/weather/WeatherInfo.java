package com.esaudev.weatherapp.domain.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J1\u0010\u000f\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/esaudev/weatherapp/domain/weather/WeatherInfo;", "", "weatherDataPerDay", "", "", "", "Lcom/esaudev/weatherapp/domain/weather/WeatherData;", "currentWeatherData", "(Ljava/util/Map;Lcom/esaudev/weatherapp/domain/weather/WeatherData;)V", "getCurrentWeatherData", "()Lcom/esaudev/weatherapp/domain/weather/WeatherData;", "getWeatherDataPerDay", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class WeatherInfo {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Integer, java.util.List<com.esaudev.weatherapp.domain.weather.WeatherData>> weatherDataPerDay = null;
    @org.jetbrains.annotations.Nullable()
    private final com.esaudev.weatherapp.domain.weather.WeatherData currentWeatherData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.esaudev.weatherapp.domain.weather.WeatherInfo copy(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends java.util.List<com.esaudev.weatherapp.domain.weather.WeatherData>> weatherDataPerDay, @org.jetbrains.annotations.Nullable()
    com.esaudev.weatherapp.domain.weather.WeatherData currentWeatherData) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherInfo(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends java.util.List<com.esaudev.weatherapp.domain.weather.WeatherData>> weatherDataPerDay, @org.jetbrains.annotations.Nullable()
    com.esaudev.weatherapp.domain.weather.WeatherData currentWeatherData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<com.esaudev.weatherapp.domain.weather.WeatherData>> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<com.esaudev.weatherapp.domain.weather.WeatherData>> getWeatherDataPerDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.esaudev.weatherapp.domain.weather.WeatherData component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.esaudev.weatherapp.domain.weather.WeatherData getCurrentWeatherData() {
        return null;
    }
}