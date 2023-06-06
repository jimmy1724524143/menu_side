package com.example.menu_side

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_entrar = findViewById<Button>(R.id.btn_entrar)
        btn_entrar.setOnClickListener {
            val menu = Intent(this, menu::class.java)
            startActivity(menu)

    }
    }
}
