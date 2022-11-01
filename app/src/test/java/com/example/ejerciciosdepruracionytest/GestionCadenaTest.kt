package com.example.ejerciciosdepruracionytest

import org.junit.Assert.*

import org.junit.Test

class GestionCadenaTest {


    lateinit var ca: GestionCadena




    @Test
    fun numletras() {

        ca = GestionCadena()

    assertEquals(4,ca.contarLetras("juan"))
    }

    @Test

    fun numVocales(){
        ca= GestionCadena()
        assertEquals(5,ca.contarVocales("Murcielago"))
    }

    @Test
    fun numPalabras(){
        ca=GestionCadena()
        assertEquals(2,ca.contarPalabras("Juan caballo"))
    }
}
