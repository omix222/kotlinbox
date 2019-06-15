package com.example.omix222.kotlinbox

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertEquals

internal class GreetingControllerTest {
    val target = GreetingController()

    @Test
    fun hello() =
        assertEquals(target.hello(),"hello kotlin !!")
}