package com.example.nuestraprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
//aqui se importa lo que necesitamos
//para poder usar visualizar el texto de nuestro saludo
//que ha sido mandado por el intent desde la actividad principal

class SaludoActivity : AppCompatActivity() {
    //aqui se asigna a nuestros atributos lo que importamos anteriormente
    private lateinit var txtSaludo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)
        //Recuperamos la información pasada en el intent
        val saludo2 = intent.getStringExtra("Nombre")
        //Construimos el mensaje a mostrar mediante esa informacion recibida
        txtSaludo.text = "Hola $saludo2"

    }
}