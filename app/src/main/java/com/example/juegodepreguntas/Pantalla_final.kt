package com.example.juegodepreguntas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf

class Pantalla_final : Fragment(R.layout.fragment_pantalla_final) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var puntajet = view.findViewById<TextView>(R.id.puntaje)
        var puntos = puntajes
        puntajet.setText(puntos)
        /* Uso la información de puntaje que paso entre fragments y lo pongo en un text view para que
        se pueda ver cuanto fue lo que acertaste

        */
    }
    /* Creo una funcion instancia que tiene por argumento el puntaje de tio entero que es nuestro puntaje de
    las preguntas y con la etiqueta de puntajes.
    */
    companion object{

        val puntajes = "Puntaje"

        fun instancia (puntaje:Int) = Pantalla_final().apply {
            arguments = bundleOf(puntajes to puntaje)
        }
    }
}