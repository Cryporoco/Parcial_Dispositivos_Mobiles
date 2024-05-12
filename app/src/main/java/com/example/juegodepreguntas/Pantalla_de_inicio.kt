package com.example.juegodepreguntas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Pantalla_de_inicio : Fragment(R.layout.fragment_pantalla_de_inicio) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var btninicio = view.findViewById<Button>(R.id.boton_comienzo)
        /* Cree un boton para comenzar las preguntas está parte está mas enfocada al diseño y no hay mucho
        más que un botón de inicio
        */
        btninicio.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.pantalla_inicio, Preguntas())
                addToBackStack("")
                commit()
            }
        }
    }
}