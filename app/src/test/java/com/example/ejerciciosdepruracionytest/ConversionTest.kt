package com.example.ejerciciosdepruracionytest

import org.junit.Assert.*

import org.junit.Test

class ConversionTest {

lateinit var conversion:Conversion


    @Test
    fun conversion(){
    conversion=Conversion()

            assertEquals(4000.0.toInt(),conversion.conversion(4.0).toInt())
    }
}