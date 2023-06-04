package com.example.smartappramos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class IMCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcactivity)

        val inputPeso: EditText = findViewById(R.id.etPeso)
        val inputEstatura: EditText = findViewById(R.id.etEstatura)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val btnRegresar: Button = findViewById(R.id.btnRegresarMain)

        val tvResultado: TextView = findViewById(R.id.txtResultado)
        val tvCategoria: TextView = findViewById(R.id.txtCategoria)

        btnRegresar.setOnClickListener {
            val intent =  Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnCalcular.setOnClickListener {
            val result = inputPeso.text.toString().toFloat()/(Math.pow(inputEstatura.text.toString()
                .toDouble(), 2.0
            ))
            var categoria = "Obesidad"
            if(result<18.5){
                categoria = "Bajo peso"
            }else if(result<25.0){
                categoria = "Peso saludable"
            }else if(result<30.0){
                categoria = "Sobrepeso"
            }
            tvResultado.setText("Resultado: "+ result.toString())
            tvCategoria.setText("Categoría: "+ categoria)

        }

    }
}