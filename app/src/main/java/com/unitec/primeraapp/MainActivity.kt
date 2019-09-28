package com.unitec.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Quitamos la action bar que aparece de defecto
        actionBar?.hide()



        //Manejamos el evento d
        ingresar.setOnClickListener{
            //Aqui ponemos el codigo de navegacion

            var i=Intent(this,BienvenidoActivity::class.java)
            startActivity(i)
        }

    }
}
