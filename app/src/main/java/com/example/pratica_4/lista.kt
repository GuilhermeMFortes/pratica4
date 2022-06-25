package com.example.pratica_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class lista:AppCompatActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)

        val botao = findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        botao.setOnClickListener {
            val intent = Intent(this, cadastro::class.java)
            startActivity(intent)
        }
    }
}