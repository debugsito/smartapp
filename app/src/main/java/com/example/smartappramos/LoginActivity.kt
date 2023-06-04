package com.example.smartappramos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val inputEmail: EditText =findViewById(R.id.edEmail);
        val inputClave: EditText =findViewById(R.id.etClave);
        val btnLogin: Button = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener {
            if(inputEmail.text.toString() == "admin@smartapp.com" && inputClave.text.toString() == "admin123" ){
                val intent =  Intent(this,MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(getApplicationContext(), "Correo y/o clave inválida", Toast.LENGTH_SHORT).show();

            }
        }

    }
}