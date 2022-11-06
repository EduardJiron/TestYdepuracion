package com.example.ejerciciosdepruracionytest

class GestionCadena {


//funcion contar vocales
    fun contarVocales(cadena: String): Int {
        var contador = 0
        for (i in cadena.indices) {
            if (cadena[i] == 'a' || cadena[i] == 'e' || cadena[i] == 'i' || cadena[i] == 'o' || cadena[i] == 'u') {
                contador++
            }
        }
        return contador
    }


//funcion contar palabra
    fun contarPalabras(cadena: String): Int {
        var contador = 0
        for (i in cadena.indices) {
            if (cadena[i] == ' ') {
                contador++
            }
        }
        return contador + 1
    }
//funcion contar letras
    fun contarLetras(cadena: String): Int {
        var contador = 0
        for (i in cadena.indices) {
            if (cadena[i] != ' ') {
                contador++
            }
        }
        return contador
    }
}