package br.com.opentelemetry.service

import org.springframework.stereotype.Service

@Service
class ServiceB {
    fun execute(): String {
        Thread.sleep(1000)
        return "ok"
    }
}