package com.unitec.primeraapp

class Milmc {
    //Vamos a generar el metodo parar calcular el imc muy sencillo

    fun calcular(peso:Float,altura:Float):Float{
        var imc = peso/(altura*altura)
        return imc
    }
}