package br.com.opentelemetry.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController(
) {
    @GetMapping()
    fun testOpenTelemetry(@RequestParam(required = false) exception: Boolean): Any {
        if (exception) {
            throw CustomException("This is a custom exception message")
        }
        return HttpStatus.OK
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class CustomException(message: String) : RuntimeException(message)
}