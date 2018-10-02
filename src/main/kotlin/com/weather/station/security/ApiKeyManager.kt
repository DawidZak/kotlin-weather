package com.weather.station.security

class ApiKeyManager private constructor(){

    val apiKey:String = System.getProperty("openweathermap.api.key")

    companion object {
        val INSTANCE:ApiKeyManager by lazy { ApiKeyManager() }
    }
}
