package com.example.barra

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.construccion.projecto.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuración para manejar la barra de navegación inferior
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Configura el listener para los ítems de la barra de navegación
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.Dos_mitades -> {
                    // Lógica para el ítem "Dos mitades"
                    true
                }
                R.id.Dos_palabras -> {
                    // Lógica para el ítem "Dos palabras"
                    true
                }
                R.id.Quitar_fragmento -> {
                    // Lógica para el ítem "Quitar fragmento"
                    true
                }
                else -> false
            }
        }

        // Mantén el comportamiento de los insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}