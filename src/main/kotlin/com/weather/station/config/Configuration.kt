package com.weather.station.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.web.client.RestTemplate

@Configuration
class Configuration {

    @Bean
    fun getRestTemplate():RestTemplate{
        val restTemplate = RestTemplate()
        val requestInterceptors : List<ClientHttpRequestInterceptor> = listOf(RestTemplateModifier())
        restTemplate.interceptors=requestInterceptors
        return restTemplate
    }
}