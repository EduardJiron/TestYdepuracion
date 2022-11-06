package com.example.ejerciciosdepruracionytest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnS:ImageView=findViewById(R.id.btnSiguiente)

        btnS.setOnClickListener(){

          var intento: Intent =  intent.setClass(this,Cadena::class.java)
            startActivity(intento)
        }



    butonclic()

    }

    private fun butonclic(){


    var txtkm:EditText=findViewById(R.id.txtKm)
    var txtmts:TextView=findViewById(R.id.txtMts)
    var btnC:ImageView=findViewById(R.id.btnConvertir)
    lateinit var kms:Conversion

    kms= Conversion()
        
    btnC.setOnClickListener(){
        try{
            txtmts.setText(kms.conversion(txtkm.text.toString().toDouble()).toString()+" mts")
            txtkm.setText("")

        }
        catch (e:Exception){
            Toast.makeText(this,"Error", Toast.LENGTH_SHORT).show()


    }


}














    }
}




