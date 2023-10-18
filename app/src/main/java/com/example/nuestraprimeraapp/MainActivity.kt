package com.example.nuestraprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
//aqui se importa lo que necesitamos
//para poder usar el boton y poder pasar la informacion a la activity saludo

class MainActivity : AppCompatActivity() {

    //aqui se asigna a nuestros atributos lo que importamos anteriormente
    private lateinit var txtNombre: EditText
    private lateinit var botonAceptar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        botonAceptar = findViewById(R.id.botonAceptar)

        botonAceptar.setOnClickListener {
            //Creamos el Intent que sirve para pasar informacion entre activitys
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)
            //Añadimos al intent la información a pasar entre actividades
            intent.putExtra("Nombre", txtNombre.text.toString())
            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}