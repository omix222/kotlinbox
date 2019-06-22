package com.example.omix222.kotlinbox


import org.junit.Test
import org.junit.Assert.assertEquals

internal class GreetingControllerTest {
    private val target = GreetingController()

   @Test
    fun hello() =
        assertEquals(target.hello(),"hello kotlin !!")
}