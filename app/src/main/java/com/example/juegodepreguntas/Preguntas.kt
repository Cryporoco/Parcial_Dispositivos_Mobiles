package com.example.juegodepreguntas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class Preguntas : Fragment(R.layout.fragment_preguntas) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var op1 = view.findViewById<Button>(R.id.opcion1)
        var op2 = view.findViewById<Button>(R.id.opcion2)
        var op3 = view.findViewById<Button>(R.id.opcion3)
        var op4 = view.findViewById<Button>(R.id.opcion4)
        var retro = view.findViewById<TextView>(R.id.texto_retro)
        var siguiente = view.findViewById<Button>(R.id.boton_siguiente)
        var pregunta = 0
        var puntaje = 0
        var pregunta_texto = view.findViewById<TextView>(R.id.texto_pregunta)
        var imagen = view.findViewById<ImageView>(R.id.imagen_pregunta)
        /* Las variables que utilizare y serán modificadas de algún u otro modo en el proceso los op 1,2,3 y 4
        son las opciones, pregunta es un contador interno para el cambio de preguntas, retro, pregunta_texto, el texto
        que se modífica con cada pregunta, imagen para la imagen de referencia y por ultimo siguiente para
        el cambio de pregunta
         */

        op1.setOnClickListener{
            Toast.makeText(requireContext(),"Correcto",Toast.LENGTH_LONG).show()
            retro.setText("Greninja se transforma con la habilidad Fuerte Afecto")
            puntaje++
        }
        op2.setOnClickListener{
            Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
            retro.setText("Greninja se transforma con la habilidad Fuerte Afecto")
        }
        op3.setOnClickListener{
            Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
            retro.setText("Greninja se transforma con la habilidad Fuerte Afecto")
        }
        op4.setOnClickListener{
            Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
            retro.setText("Greninja se transforma con la habilidad Fuerte Afecto")
        }
        /* El inicio de la primera pregunta donde al seleccionar cualquier opción te salga la retroalimentación y
        un toast que te diga si es correcto o incorrecto lo marcado (lo hise en toast por tema de espacio no sabia como
        marcar correcto o incorrecto sin que quede feo) y al marcar la respuesta correcta el puntaje aumenta
        en uno sino no aumenta
        */

        /* Creo una función para cuando se quiera cambiar de pregunta con un if dentro que lo explicaré
        mejor con el boton siguiente que viene después
         */
        fun preguntas (){
            if (pregunta == 1){

                op1.setText("Agua/Planta")
                op2.setText("Normal/Fantasma")
                op3.setText("Tierra/Volador")
                op4.setText("Normal/Bicho")
                pregunta_texto.setText("¿Que combinación de tipos solo la tiene una cadena evolutiva?")
                var imagen_cambio = ContextCompat.getDrawable(requireContext(),R.drawable.tabla_tipos)
                imagen.setImageDrawable(imagen_cambio)
                /* Con el cambio de pregunta la pregunta, las opciones y la imagen cambia, al incio de
                cada pregunta cambian, la imagen creo un contextcompact en la variabe imagen_cambio
                que sirve para almacenar la imagen que quiero usar despues y con el setimagedrawable
                pongo el nombre con la variable con la imagen que quiero
                 */

                /* En las opciones no hay mucho cambio solo el texto de la retroalimentacion esto se repite
                en cada una asi que solo lo dire en esta para no sonar repetivo.
                En el último caso cuando se reemplza el fragment ya para la pantalla final le agrego
                una función instancia creada en la Pantalla final para pasar el valor del puntaje.
                */

                op1.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("La combinación única de tipos por el momento es Normal/Fantasma y solo la tiene Zorua y Zoruark de Hisui")
                }
                op2.setOnClickListener{
                    Toast.makeText(requireContext(),"Correcta",Toast.LENGTH_LONG).show()
                    retro.setText("La combinación única de tipos por el momento es Normal/Fantasma y solo la tiene Zorua y Zoruark de Hisui")
                    puntaje++
                }
                op3.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("La combinación única de tipos por el momento es Normal/Fantasma y solo la tiene Zorua y Zoruark de Hisui")
                }
                op4.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("La combinación única de tipos por el momento es Normal/Fantasma y solo la tiene Zorua y Zoruark de Hisui")
                }
            }
            if (pregunta == 2){

                op1.setText("Espion")
                op2.setText("Glaceon")
                op3.setText("Jolteon")
                op4.setText("Sylveon")
                pregunta_texto.setText("¿Que eeveelution es de tipo hada?")
                var imagen_cambio = ContextCompat.getDrawable(requireContext(),R.drawable.eve)
                imagen.setImageDrawable(imagen_cambio)

                op1.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("La eeveelution de tipo de hada es Sylveon")
                }
                op2.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("La eeveelution de tipo de hada es Sylveon")
                }
                op3.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("La eeveelution de tipo de hada es Sylveon")
                }
                op4.setOnClickListener{
                    Toast.makeText(requireContext(),"Correcto",Toast.LENGTH_LONG).show()
                    retro.setText("La eeveelution de tipo de hada es Sylveon")
                    puntaje++
                }
            }
            if (pregunta == 3){

                op1.setText("Ultimo Suspiro")
                op2.setText("Truco Floral")
                op3.setText("Roca Afilada")
                op4.setText("Brecha Negra")
                pregunta_texto.setText("¿Cúal es el movimiento exlusivo de Meowscarada?")
                var imagen_cambio = ContextCompat.getDrawable(requireContext(),R.drawable.meowscarada)
                imagen.setImageDrawable(imagen_cambio)

                op1.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("El movimiento exclusico de Meowscarada es Truco Floral")
                }
                op2.setOnClickListener{
                    Toast.makeText(requireContext(),"Correcto",Toast.LENGTH_LONG).show()
                    retro.setText("El movimiento exclusico de Meowscarada es Truco Floral")
                    puntaje++
                }
                op3.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("El movimiento exclusico de Meowscarada es Truco Floral")
                }
                op4.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("El movimiento exclusico de Meowscarada es Truco Floral")
                }
            }
            if (pregunta == 4){

                op1.setText("Oshawott")
                op2.setText("Snivy")
                op3.setText("Poplio")
                op4.setText("Tepig")
                pregunta_texto.setText("¿Qué inicial no es de la región de Teselia?")
                var imagen_cambio = ContextCompat.getDrawable(requireContext(),R.drawable.teselia)
                imagen.setImageDrawable(imagen_cambio)

                op1.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("El único starter que no es de la región de Teselia es Poplio")
                }
                op2.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("El único starter que no es de la región de Teselia es Poplio")
                }
                op3.setOnClickListener{
                    Toast.makeText(requireContext(),"Correcto",Toast.LENGTH_LONG).show()
                    retro.setText("El único starter que no es de la región de Teselia es Poplio")
                    puntaje++
                }
                op4.setOnClickListener{
                    Toast.makeText(requireContext(),"Incorrecto",Toast.LENGTH_LONG).show()
                    retro.setText("El único starter que no es de la región de Teselia es Poplio")
                }
            }
            if (pregunta == 5){
                requireActivity().supportFragmentManager.beginTransaction().apply {
                    replace(R.id.pantalla_inicio, Pantalla_final.instancia(puntaje.toInt()))
                    addToBackStack("")
                    commit()
                }
            }
        }

        /*Lo primero que hace al tocar el boton siguiente es aumenta el contador pregunta en uno para que
        luego llame a la funcion preguntas  y con el if vaya cambiando de perguntas mientras el contador
        aumenta y por ultimo pone el texto de la retroalimentación en blanco para que no se choque
        con la información anterior

         */
        siguiente.setOnClickListener{

            pregunta++
            preguntas()
            retro.setText("")
        }

    }



}