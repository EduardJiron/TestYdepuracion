package com.example.ejerciciosdepruracionytest

import org.junit.Assert.*

import org.junit.Test

class GestionCadenaTest {

// tes unitario de las funcines
    lateinit var ca: GestionCadena
//test de las funcion contar letra
    @Test
    fun numletras() {

        ca = GestionCadena()

    assertEquals(4,ca.contarLetras("juan"))
    }
//test de la funcion contar vocales
    @Test

    fun numVocales(){
        ca= GestionCadena()
        assertEquals(5,ca.contarVocales("Murcielago"))
    }
 // test de la funcion numero de palabras
    @Test
    fun numPalabras(){
        ca=GestionCadena()
        assertEquals(2,ca.contarPalabras("Juan caballo"))
    }
}
