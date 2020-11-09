package com.alsauza.ecuacindelarectai

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import java.math.BigInteger
import kotlin.math.roundToInt


/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment(), View.OnClickListener {
    private lateinit var num1: TextView
    private lateinit var deno1: TextView
    private lateinit var coordenadas: TextView
    private lateinit var signo1: TextView

    private lateinit var coordenadaY2: TextView
    private lateinit var coordenadaX2: TextView
    private lateinit var signo2: TextView
    private lateinit var numerador2: TextView
    private lateinit var denominador2: TextView

    private lateinit var coordenadasY3: TextView
    private lateinit var signo3: TextView
    private lateinit var numerador3: TextView
    private lateinit var denominador3: TextView

    private lateinit var coordenadasY4: TextView
    private lateinit var signo4: TextView
    private lateinit var numerador4: TextView
    private lateinit var denominador4: TextView

    private lateinit var signo5: TextView
    private lateinit var numerador5: TextView
    private lateinit var denominador5: TextView


    private lateinit var igual2: TextView
    private lateinit var igual3: TextView
    private lateinit var igual4: TextView
    private lateinit var segundoMas: TextView

    private lateinit var segundob: TextView
    private lateinit var tercerb: TextView
    private lateinit var cuartob: TextView

    private lateinit var cociente2: TextView
    private lateinit var cociente3: TextView
    private lateinit var cociente4: TextView

    private var x1:Int=0
    private var y1:Int=0

    private var mSigno:Int=0
    private var mNumerador:Int=0

    private var mDenominador:Int=0

private val animar: Animation = AlphaAnimation(0.0f, 1.0f)

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btn0: Button
    private lateinit var btnHecho: Button
    private lateinit var btnBorra: Button
    private lateinit var btnSiguiente: Button
    private lateinit var btnMas: Button
    private lateinit var btnMenos: Button
    private lateinit var instrucciones: TextView
    private lateinit var aciertos:TextView

    private var campo1: Boolean=false
    private var campo2: Boolean=false
    private var campo3: Boolean=false
    private var campo4: Boolean=false
    private var campo5: Boolean=false
    private var campo6: Boolean=false
    private var campo7: Boolean=false
    private var campo8: Boolean=false
    private var campo9: Boolean=false
    private var campo10: Boolean=false
    private var campo11: Boolean=false
    private var campo12: Boolean=false
    private var campo13: Boolean=false
    private var campo14: Boolean=false
    private var campo15: Boolean=false
    private var campo16: Boolean=false


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmento2 =inflater.inflate(R.layout.fragment_second, container, false)

       animar.duration = 400 //You can manage the blinking time with this parameter
        animar.startOffset = 80
        animar.repeatMode = Animation.REVERSE
        animar.repeatCount = Animation.INFINITE

        asignaVariables(fragmento2)
        asingaListener()
        inicial()
        return fragmento2
    }

    private fun inicial() {
        campo1 = true
        campo2 = false
        campo3 = false
        campo4 = false
        campo5 = false
        campo6 = false
        campo7 = false
        campo8 = false
        campo9 = false
        campo10 = false
        campo11= false
        campo12= false
        campo13 = false
        campo14 = false
        campo15 = false
        campo16= false

        //btnSiguiente.isEnabled = false



       /* coordenadasY3.visibility=View.INVISIBLE
        signo3.visibility=View.INVISIBLE
        numerador3.visibility=View.INVISIBLE
        denominador3.visibility=View.INVISIBLE
        coordenadasY4.visibility=View.INVISIBLE
        signo4.visibility=View.INVISIBLE
        numerador4.visibility=View.INVISIBLE
        denominador4.visibility=View.INVISIBLE
        signo5.visibility=View.INVISIBLE
        numerador5.visibility=View.INVISIBLE
        denominador5.visibility=View.INVISIBLE
        igual2.visibility=View.INVISIBLE
        igual3.visibility=View.INVISIBLE
        igual4.visibility=View.INVISIBLE
        segundoMas.visibility=View.INVISIBLE
        segundob.visibility=View.INVISIBLE
        tercerb.visibility=View.INVISIBLE
        cuartob.visibility=View.INVISIBLE
        cociente4.visibility=View.INVISIBLE
        cociente3.visibility=View.INVISIBLE
        cociente2.visibility=View.INVISIBLE*/


        coordenadaY2.text=""
        coordenadaX2.text=""
        signo2.text=""
        numerador2.text=""
        denominador2.text=""

        coordenadasY3.text=""
        signo3.text=""
        numerador3.text=""
        denominador3.text=""

        coordenadasY4.text=""
        signo4.text=""
        numerador4.text=""
        denominador4.text=""


        signo5.text=""
        numerador5.text=""
        denominador5.text=""

        coordenadaY2.startAnimation(animar)

  generaNumeros()
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.button1 -> {
                if (campo1) coordenadaY2.append("1")
                if (campo3) numerador2.append("1")
                if (campo4) denominador2.append("1")
                if (campo5) coordenadaX2.append("1")
                if (campo6) coordenadasY3.append("1")
                if (campo8) denominador3.append("1")
                if (campo9) denominador3.append("1")
                if (campo10) coordenadasY4.append("1")
                if (campo12) numerador4.append("1")
                if (campo13) denominador4.append("1")
                if (campo15) numerador5.append("1")
                if (campo16) denominador5.append("1")
            }
            R.id.button2 -> {
                if (campo1) coordenadaY2.append("2")
                if (campo3) numerador2.append("2")
                if (campo4) denominador2.append("2")
                if (campo5) coordenadaX2.append("2")
                if (campo6) coordenadasY3.append("2")
                if (campo8) denominador3.append("2")
                if (campo9) denominador3.append("2")
                if (campo10) coordenadasY4.append("2")
                if (campo12) numerador4.append("2")
                if (campo13) denominador4.append("2")
                if (campo15) numerador5.append("2")
                if (campo16) denominador5.append("2")
            }
            R.id.button3 -> {
                if (campo1) coordenadaY2.append("3")
                if (campo3) numerador2.append("3")
                if (campo4) denominador2.append("3")
                if (campo5) coordenadaX2.append("3")
                if (campo6) coordenadasY3.append("3")
                if (campo8) denominador3.append("3")
                if (campo9) denominador3.append("3")
                if (campo10) coordenadasY4.append("3")
                if (campo12) numerador4.append("3")
                if (campo13) denominador4.append("3")
                if (campo15) numerador5.append("3")
                if (campo16) denominador5.append("3")
            }
            R.id.button4 -> {
                if (campo1) coordenadaY2.append("4")
                if (campo3) numerador2.append("4")
                if (campo4) denominador2.append("4")
                if (campo5) coordenadaX2.append("4")
                if (campo6) coordenadasY3.append("4")
                if (campo8) denominador3.append("4")
                if (campo9) denominador3.append("4")
                if (campo10) coordenadasY4.append("4")
                if (campo12) numerador4.append("4")
                if (campo13) denominador4.append("4")
                if (campo15) numerador5.append("4")
                if (campo16) denominador5.append("4")
            }
            R.id.button5 -> {
                if (campo1) coordenadaY2.append("5")
                if (campo3) numerador2.append("5")
                if (campo4) denominador2.append("5")
                if (campo5) coordenadaX2.append("5")
                if (campo6) coordenadasY3.append("5")
                if (campo8) denominador3.append("5")
                if (campo9) denominador3.append("5")
                if (campo10) coordenadasY4.append("5")
                if (campo12) numerador4.append("5")
                if (campo13) denominador4.append("5")
                if (campo15) numerador5.append("5")
                if (campo16) denominador5.append("5")
            }
            R.id.button6 -> {
                if (campo1) coordenadaY2.append("6")
                if (campo3) numerador2.append("6")
                if (campo4) denominador2.append("6")
                if (campo5) coordenadaX2.append("6")
                if (campo6) coordenadasY3.append("6")
                if (campo7) signo3.append("6")
                if (campo8) denominador3.append("6")
                if (campo9) denominador3.append("6")
                if (campo10) coordenadasY4.append("6")
                if (campo12) numerador4.append("6")
                if (campo13) denominador4.append("6")
                if (campo15) numerador5.append("6")
                if (campo16) denominador5.append("6")
            }
            R.id.button7 -> {
                if (campo1) coordenadaY2.append("7")
                if (campo3) numerador2.append("7")
                if (campo4) denominador2.append("7")
                if (campo5) coordenadaX2.append("7")
                if (campo6) coordenadasY3.append("7")
                if (campo8) denominador3.append("7")
                if (campo9) denominador3.append("7")
                if (campo10) coordenadasY4.append("7")
                if (campo12) numerador4.append("7")
                if (campo13) denominador4.append("7")
                if (campo15) numerador5.append("7")
                if (campo16) denominador5.append("7")
            }
            R.id.button8 -> {
                if (campo1) coordenadaY2.append("8")
                if (campo3) numerador2.append("8")
                if (campo4) denominador2.append("8")
                if (campo5) coordenadaX2.append("8")
                if (campo6) coordenadasY3.append("8")
                if (campo8) denominador3.append("8")
                if (campo9) denominador3.append("8")
                if (campo10) coordenadasY4.append("8")
                if (campo12) numerador4.append("8")
                if (campo13) denominador4.append("8")
                if (campo15) numerador5.append("8")
                if (campo16) denominador5.append("8")
            }
            R.id.button9 -> {
                if (campo1) coordenadaY2.append("9")
                if (campo3) numerador2.append("9")
                if (campo4) denominador2.append("9")
                if (campo5) coordenadaX2.append("9")
                if (campo6) {

                    coordenadasY3.append("9")
                }
                if (campo8) denominador3.append("9")
                if (campo9) denominador3.append("9")
                if (campo10) coordenadasY4.append("9")
                if (campo12) numerador4.append("9")
                if (campo13) denominador4.append("9")
                if (campo15) numerador5.append("9")
                if (campo16) denominador5.append("9")
            }
            R.id.button0 -> {
                if (campo1) coordenadaY2.append("0")
                if (campo3) numerador2.append("0")
                if (campo4) denominador2.append("0")
                if (campo5) coordenadaX2.append("0")
                if (campo6) coordenadasY3.append("0")
                if (campo8) denominador3.append("0")
                if (campo9) denominador3.append("0")
                if (campo10) coordenadasY4.append("0")
                if (campo12) numerador4.append("0")
                if (campo13) denominador4.append("0")
                if (campo15) numerador5.append("0")
                if (campo16) denominador5.append("0")
            }
            R.id.buttonMas -> {


                if (coordenadaY2.length() == 0 && campo1) coordenadaY2.append("+")
                if (signo2.length() == 0 && campo2) signo2.append("+")
                if (numerador2.length() == 0 && campo3) numerador2.append("+")
                if (denominador2.length() == 0 && campo4) denominador2.append("+")
                if (coordenadaX2.length() == 0 && campo5) coordenadaX2.append("+")
                if (coordenadasY3.length() == 0 && campo6) coordenadasY3.append("+")
                if (signo3.length() == 0 && campo7) signo3.append("+")
                if (numerador3.length() == 0 && campo8) numerador3.append("+")
                if (denominador3.length() == 0 && campo9) denominador3.append("+")
                if (coordenadasY4.length() == 0 && campo10) coordenadasY4.append("+")
                if (signo4.length() == 0 && campo11) signo4.append("+")
                if (numerador4.length() == 0 && campo12) numerador4.append("+")
                if (denominador4.length() == 0 && campo13) denominador4.append("+")
                if (signo5.length() == 0 && campo14) signo5.append("+")
                if (numerador5.length() == 0 && campo15) numerador5.append("+")
                if (denominador5.length() == 0 && campo6) denominador5.append("+")
            }
            R.id.buttonMenos -> {


                if (coordenadaY2.length() == 0 && campo1) coordenadaY2.append("-")
                if (signo2.length() == 0 && campo2) signo2.append("-")
                if (numerador2.length() == 0 && campo3) numerador2.append("-")
                if (denominador2.length() == 0 && campo4) denominador2.append("-")
                if (coordenadaX2.length() == 0 && campo5) coordenadaX2.append("-")
                if (coordenadasY3.length() == 0 && campo6) coordenadasY3.append("-")
                if (signo3.length() == 0 && campo7) signo3.append("-")
                if (numerador3.length() == 0 && campo8) numerador3.append("-")
                if (denominador3.length() == 0 && campo9) denominador3.append("-")
                if (coordenadasY4.length() == 0 && campo10) coordenadasY4.append("-")
                if (signo4.length() == 0 && campo11) signo4.append("-")
                if (numerador4.length() == 0 && campo12) numerador4.append("-")
                if (denominador4.length() == 0 && campo13) denominador4.append("-")
                if (signo5.length() == 0 && campo14) signo5.append("-")
                if (numerador5.length() == 0 && campo15) numerador5.append("-")
                if (denominador5.length() == 0 && campo6) denominador5.append("-")

            }
            R.id.buttonHecho -> {
                if (campo6) compruebaY2()
                if (campo5) compruebaX2()
                if (campo4) compruebaDenominador2()
                if (campo3) compruebaNumerador2()
                if (campo2) compruebaSigno2()
                if (campo1) compruebaY2()


            }
            R.id.buttonBorra -> {
                if (campo1) {
                    coordenadaY2.text = ""
                    instrucciones.text = "Sustituye y1 "
                }

                if (campo2) {
                    signo2.text = ""
                    instrucciones.text = "Determina el signo "
                }
                if (campo3) {
                    numerador2.text = ""
                    instrucciones.text = "Determina el numerador"
                }

                if (campo4) {
                    denominador2.text = ""
                    instrucciones.text = "Determina el denominador"
                }


                if (campo6) {
                    coordenadasY3.text = ""
                    instrucciones.text = "Determian y1"
                }
                if (campo5) {
                    coordenadaY2.text = ""
                    instrucciones.text = "Sustituye x1"
                }
            }

        }
    }



    private fun compruebaNumerador2() {
        TODO("Not yet implemented")
    }

    private fun compruebaDenominador2() {
        TODO("Not yet implemented")
    }

    private fun compruebaX2() {
        TODO("Not yet implemented")
    }
    private fun compruebaSigno2() {
        TODO("Not yet implemented")
    }
    private fun compruebaY2() {
        if (coordenadaY2.length() == 0 || coordenadaY2.getText().toString() == "-" || coordenadaY2.getText().toString() == "+"){
            instrucciones.text = "Incorrecto, sustituye y1"
            return}

       if (coordenadaY2.getText().toString().toInt() == y1) {
            instrucciones.text = "Correcto, ahora determina signo de la pendiente"
            coordenadaY2.setBackgroundResource(R.color.colorOroUNAM)

           coordenadaY2.clearAnimation()

           animar.cancel()
           animar.reset()
           campo1 = false
            campo2 = true
            campo3 = false
            campo4 = false
            campo5 = false
            campo6 = false
           campo7 = false
           campo8 = false
           campo9 = false
           campo10 = false
           campo11= false
           campo12= false
           campo13 = false
           campo14 = false
           campo15 = false
           campo16= false

            signo2.startAnimation(animar)

        }else {
            instrucciones.text = "Incorrecto, sustituye y1"

        }
    }
    private fun generaNumeros() {

        do {

            var pote1=(Math.random() * 10 + 1)
            var recorta= pote1.roundToInt().toDouble()
            var apotenciaUno=Math.pow(-1.0, recorta)

            var pote2=(Math.random() * 10 + 1)
            var recorta2= pote2.roundToInt().toDouble()
            var apotenciaDos=Math.pow(-1.0, recorta2)

            var pote3=(Math.random() * 10 + 1)
            var recorta3= pote3.roundToInt().toDouble()
            mSigno=Math.pow(-1.0, recorta3).toInt()

            x1= ( (Math.random() * 9+1 ) * apotenciaUno).toInt()
            y1 = ((Math.random() * 9+1 ) * apotenciaDos).toInt()

            mDenominador= (Math.random() * 9+1 ).toInt()
            mNumerador =  (Math.random() * 9+1 ).toInt()

            var a1 = BigInteger(mNumerador.toString())
            var b1 = BigInteger(mDenominador.toString())
            var comunDivisor: BigInteger = a1.gcd(b1)


        } while (x1 == 0 || y1==0 || mDenominador==0 || mNumerador==0 || comunDivisor.toString().toInt() != 1 ||  mDenominador==1)


        if(mSigno==1) signo1.text="+" else signo1.text="-"

        num1.text="$mNumerador"
        deno1.text="$mDenominador"
        coordenadas.text="($x1 , $y1 )"


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSiguiente.setOnClickListener {
          inicial()
            //  findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

    }


    private fun asingaListener() {
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btn0.setOnClickListener(this)
        btnMas.setOnClickListener(this)
        btnMenos.setOnClickListener(this)
        btnBorra.setOnClickListener(this)
        btnHecho.setOnClickListener(this)
       btnSiguiente.setOnClickListener(this)


    }
    private fun asignaVariables(fragmento2: View) {
        btn1 = fragmento2.findViewById<Button>(R.id.button1)
        btn2 = fragmento2.findViewById<Button>(R.id.button2)
        btn3 = fragmento2.findViewById<Button>(R.id.button3)
        btn4 = fragmento2.findViewById<Button>(R.id.button4)
        btn5 = fragmento2.findViewById<Button>(R.id.button5)
        btn6 = fragmento2.findViewById<Button>(R.id.button6)
        btn7 = fragmento2.findViewById<Button>(R.id.button7)
        btn8 = fragmento2.findViewById<Button>(R.id.button8)
        btn9 = fragmento2.findViewById<Button>(R.id.button9)
        btn0 = fragmento2.findViewById<Button>(R.id.button0)
        btnMenos = fragmento2.findViewById<Button>(R.id.buttonMenos)
        btnMas = fragmento2.findViewById<Button>(R.id.buttonMas)
        btnHecho = fragmento2.findViewById<Button>(R.id.buttonHecho)
        btnBorra = fragmento2.findViewById<Button>(R.id.buttonBorra)
        btnSiguiente = fragmento2.findViewById<Button>(R.id.button)
        instrucciones= fragmento2.findViewById<Button>(R.id.instruccion)

        aciertos= fragmento2.findViewById<Button>(R.id.aciertos)
        signo1=fragmento2.findViewById<Button>(R.id.textView34)
        num1=fragmento2.findViewById<Button>(R.id.textView41)
        deno1=fragmento2.findViewById<Button>(R.id.textView42)
        coordenadas=fragmento2.findViewById<Button>(R.id.tvPunto)

        coordenadaY2=fragmento2.findViewById<Button>(R.id.textView3)
        signo2=fragmento2.findViewById<Button>(R.id.signo1)
        numerador2=fragmento2.findViewById<Button>(R.id.textView12)
        denominador2=fragmento2.findViewById<Button>(R.id.textView13)
        coordenadaX2=fragmento2.findViewById<Button>(R.id.textView8)

        coordenadasY3=fragmento2.findViewById<Button>(R.id.textView14)
        signo3=fragmento2.findViewById<Button>(R.id.signo16)
        numerador3=fragmento2.findViewById<Button>(R.id.textView23)
        denominador3=fragmento2.findViewById<Button>(R.id.textView24)

        coordenadasY4=fragmento2.findViewById<Button>(R.id.textView20)
        signo4=fragmento2.findViewById<Button>(R.id.textView25)
        numerador4=fragmento2.findViewById<Button>(R.id.textView18)
        denominador4=fragmento2.findViewById<Button>(R.id.textView19)

        signo5=fragmento2.findViewById<Button>(R.id.textView33)
        numerador5=fragmento2.findViewById<Button>(R.id.textView31)
        denominador5=fragmento2.findViewById<Button>(R.id.textView32)


        igual2=fragmento2.findViewById<Button>(R.id.textView15)
        igual3=fragmento2.findViewById<Button>(R.id.textView26)
        igual4=fragmento2.findViewById<Button>(R.id.textView29)
        segundoMas=fragmento2.findViewById<Button>(R.id.textView21)

        segundob=fragmento2.findViewById<Button>(R.id.textView22)
        tercerb=fragmento2.findViewById<Button>(R.id.textView27)
        cuartob=fragmento2.findViewById<Button>(R.id.textView30)

        cociente2=fragmento2.findViewById<Button>(R.id.textView17)
        cociente3=fragmento2.findViewById<Button>(R.id.textView16)
        cociente4=fragmento2.findViewById<Button>(R.id.textView28)


    }


}