package com.unitec.primeraapp

import android.media.MediaPlayer
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_bienvenido.*
import kotlinx.android.synthetic.main.content_bienvenido.*

class BienvenidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->


            var peso= txtpeso.text.toString().toFloat()
            var altura= txtaltura.text.toString().toFloat()
            var imc = Milmc()

            var valor = imc.calcular(peso, altura)
            // comparamos

            if(valor>=20 && valor <=30){
                var sonido=MediaPlayer.create(applicationContext, R.raw.feliz)
                //Se inicia el sonido
                sonido.start()
            }
            else{
                var sonido2=MediaPlayer.create(applicationContext, R.raw.sad)
                //Se inicia el sonido
                sonido2.start()
            }

            Snackbar.make(view, "Tu imc es $valor", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
