package com.weather.station.config

import com.weather.station.security.ApiKeyManager
import org.springframework.http.HttpRequest
import org.springframework.http.client.support.HttpRequestWrapper
import java.net.URI

class ApiKeyHttpRequestWrapper(request: HttpRequest) : HttpRequestWrapper(request) {

    override fun getURI(): URI {
        return URI.create(super.getURI().toString()+"&appid="+ApiKeyManager.INSTANCE.apiKey)
    }
}