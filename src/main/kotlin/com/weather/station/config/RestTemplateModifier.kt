package com.weather.station.config

import org.springframework.http.HttpRequest
import org.springframework.http.client.ClientHttpRequestExecution
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.ClientHttpResponse

class RestTemplateModifier : ClientHttpRequestInterceptor {

    override fun intercept(p0: HttpRequest, p1: ByteArray, p2: ClientHttpRequestExecution): ClientHttpResponse {
        return p2.execute(ApiKeyHttpRequestWrapper(p0), p1)
    }
}