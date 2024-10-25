package com.construccion.projecto

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class IniciarSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_iniciar_sesion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val toolbar : MaterialToolbar = findViewById(R.id.topAppBar)
        toolbar.setNavigationOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
    private fun loginUser() {
        val emailOusuario = findViewById<EditText>(R.id.usuarioOcorreo).text.toString().trim()
        val contraseña = findViewById<EditText>(R.id.contraseñaCampoInicio).text.toString().trim()

        if (emailOusuario.isEmpty() || contraseña.isEmpty()) {
            Toast.makeText(this, "Por favor llena todos los campos", Toast.LENGTH_SHORT).show()
            return
        } else {
            Toast.makeText(this, "Por favor llena todos los campos", Toast.LENGTH_SHORT).show()
            return
        }


    }
}