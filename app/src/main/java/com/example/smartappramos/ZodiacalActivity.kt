package com.example.smartappramos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

class ZodiacalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zodiacal)

        val inputFecha: EditText = findViewById(R.id.etDate)
        val btnConsultar: Button = findViewById(R.id.btnConsultar)
        val btnBack: Button = findViewById(R.id.btnBack)

        val tvSigno: TextView = findViewById(R.id.tvSigno)
        val tvEdad: TextView = findViewById(R.id.tvEdad)

        btnBack.setOnClickListener {
            val intent =  Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnConsultar.setOnClickListener {
            val textoFecha = inputFecha.text.toString()

            val partes = textoFecha.split("-")
            val year = partes[0]
            val mes = partes[1]
            val dia = partes[2]
            var signo = ""
            if((mes=="12" && dia.toInt()>=22) ||(mes=="01" && dia.toInt()<=20) ){
                signo = "CAPRICORNIO"
            }else if((mes=="01" && dia.toInt()>=21) ||(mes=="02" && dia.toInt()<=19) ){
                signo = "ACUARIO"
            }else if((mes=="02" && dia.toInt()>=20) ||(mes=="03" && dia.toInt()<=20) ){
                signo = "PISCIS"
            }else if((mes=="03" && dia.toInt()>=21) ||(mes=="04" && dia.toInt()<=20) ){
                signo = "ARIES"
            }else if((mes=="04" && dia.toInt()>=21) ||(mes=="05" && dia.toInt()<=21) ){
                signo = "TAURO"
            }else if((mes=="05" && dia.toInt()>=22) ||(mes=="06" && dia.toInt()<=21) ){
                signo = "GÉMINIS"
            }else if((mes=="06" && dia.toInt()>=22) ||(mes=="07" && dia.toInt()<=22) ){
                signo = "CÁNCER"
            }else if((mes=="07" && dia.toInt()>=23) ||(mes=="08" && dia.toInt()<=22) ){
                signo = "LEO"
            }else if((mes=="08" && dia.toInt()>=23) ||(mes=="09" && dia.toInt()<=22) ){
                signo = "VIRGO"
            }else if((mes=="09" && dia.toInt()>=23) ||(mes=="10" && dia.toInt()<=22) ){
                signo = "LIBRA"
            }else if((mes=="10" && dia.toInt()>=23) ||(mes=="11" && dia.toInt()<=22) ){
                signo = "ESCORPIO"
            }else if((mes=="11" && dia.toInt()>=23) ||(mes=="12" && dia.toInt()<=21) ){
                signo = "SAGITARIO"
            }
            tvSigno.setText("Signo: "+ signo)
            val edad = 2023-year.toInt();
            tvEdad.setText("Edad: " +  edad.toString())


        }

    }
}