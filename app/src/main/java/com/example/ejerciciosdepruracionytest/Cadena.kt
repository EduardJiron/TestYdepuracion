package com.example.ejerciciosdepruracionytest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


class Cadena : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadena)


        val cadena1:EditText=findViewById(R.id.txtCadena1)

        val btnletra: Button =findViewById(R.id.btnletra)
        val btnvocal: Button =findViewById(R.id.btnvocal)
        val btnpalabra:Button=findViewById(R.id.btnpalabra)
        val textviewR:TextView=findViewById(R.id.txtResult)
        val btnAntes:ImageView=findViewById(R.id.btnAnterior)

        var gestion:GestionCadena = GestionCadena()

        btnletra.setOnClickListener(){

            textviewR.text = "la cadena posee "+ gestion.contarLetras(cadena1.text.toString())+" letras"

        }


        btnvocal.setOnClickListener(){
            textviewR.text = "la cadena posee "+ gestion.contarVocales(cadena1.text.toString())+" vocales"
        }

        btnpalabra.setOnClickListener(){
            textviewR.text = "la cadena posee "+ gestion.contarPalabras(cadena1.text.toString())+" Palabras"
        }

        btnAntes.setOnClickListener(){


            val intento:Intent=Intent(this,MainActivity::class.java)

            startActivity(intento)

        }
    }
}

