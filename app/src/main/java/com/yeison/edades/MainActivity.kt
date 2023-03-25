package com.yeison.edades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    var campoNombre: EditText?= null
    var campoDireccion: EditText?= null
    var campoTelefono: EditText?= null
    var campoEmail: EditText?=null
    var campoDocumento: EditText?=null
    var campoEdad:EditText?=null
    var campoRango:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("info", "este es un oncreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



     val miBoton:Button= findViewById(R.id.buttonIngresar)
     miBoton.setOnClickListener{onClick()}
        campoNombre=findViewById(R.id.inputname)
        campoDireccion=findViewById(R.id.inputDireccion)
        campoTelefono=findViewById(R.id.inputTelefono)
        campoEmail=findViewById(R.id.inputEmail)
        campoDocumento=findViewById(R.id.inputDocumento)
        campoEdad=findViewById(R.id.inputEdad)
        campoRango=findViewById(R.id.textRango)



    }


        fun validation() {

                var edad:Int=campoEdad?.text.toString().toInt()

            if (edad >=0 && edad <= 15) {
                campoRango!!.text = "Usted es Infante"
            } else if (edad >= 15 && edad  <= 18) {
                campoRango!!.text = "Usted es adolescente"
            } else if (edad >= 18 && edad <= 65) {
                campoRango!!.text = "Usted es adulto"
            } else if (edad >= 65) {
                campoRango!!.text = "Usted es adulto mayor"
            }
        }

    private fun onClick(){
        Log.i("info", "este es un onclick")

        var nombre:String=campoNombre!!.text.toString()
        var direccion:String=campoDireccion!!.text.toString()
        var telefono:String=campoTelefono!!.text.toString()
        var email:String=campoEmail!!.text.toString()
        var documento:String=campoDocumento!!.text.toString()
        validation()
        var edad:String=campoEdad!!.text.toString()


        Toast.makeText(this, "Bienvenido $nombre\n Su Direccion es: $direccion\n " +
                "Su Telefono es: $telefono\n Su email es: $email\n Su Documento es: $documento\n Su edad es: $edad\n",Toast.LENGTH_LONG).show()


    }










}