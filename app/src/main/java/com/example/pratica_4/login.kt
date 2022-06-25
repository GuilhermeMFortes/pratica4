package com.example.pratica_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class login:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)
        val botao = findViewById<Button>(R.id.button2)
        botao.setOnClickListener {
            val intent = Intent(this, lista::class.java)
            startActivity(intent)
        }
    }
}