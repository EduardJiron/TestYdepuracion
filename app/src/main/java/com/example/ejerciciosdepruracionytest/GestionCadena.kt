package com.example.ejerciciosdepruracionytest

class GestionCadena {



    fun contarVocales(cadena: String): Int {
        var contador = 0
        for (i in cadena.indices) {
            if (cadena[i] == 'a' || cadena[i] == 'e' || cadena[i] == 'i' || cadena[i] == 'o' || cadena[i] == 'u') {
                contador++
            }
        }
        return contador
    }



    fun contarPalabras(cadena: String): Int {
        var contador = 0
        for (i in cadena.indices) {
            if (cadena[i] == ' ') {
                contador++
            }
        }
        return contador + 1
    }

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