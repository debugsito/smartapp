package com.example.smartappramos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegresar: Button = findViewById(R.id.btnRegresar);
        val btnIMC: Button = findViewById(R.id.btnIMC);
        val btnZodiacal: Button = findViewById(R.id.btnSignoZodiacal);
        val btnGeneraciones: Button = findViewById(R.id.btnGeneraciones);

        btnGeneraciones.setOnClickListener {
            val intent =  Intent(this,GeneracionActivity::class.java)
            startActivity(intent)
        }

        btnIMC.setOnClickListener {
            val intent =  Intent(this,IMCActivity::class.java)
            startActivity(intent)
        }
        btnZodiacal.setOnClickListener {
            val intent =  Intent(this,ZodiacalActivity::class.java)
            startActivity(intent)
        }
        btnRegresar.setOnClickListener {
            val intent =  Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}