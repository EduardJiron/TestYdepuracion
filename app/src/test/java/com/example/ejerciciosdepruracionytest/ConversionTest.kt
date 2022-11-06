package com.example.ejerciciosdepruracionytest

import org.junit.Assert.*

import org.junit.Test

class ConversionTest {

lateinit var conversion:Conversion

//test de converion de kilometros a metros
    @Test
    fun conversion(){
    conversion=Conversion()

            assertEquals(4000.0.toInt(),conversion.conversion(4.0).toInt())
    }
}