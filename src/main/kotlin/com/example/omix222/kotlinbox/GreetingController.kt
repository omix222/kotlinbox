package com.example.omix222.kotlinbox


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hello")
class GreetingController {

    @GetMapping
    fun hello(): String {
        return "hello kotlin !!"
    }
}