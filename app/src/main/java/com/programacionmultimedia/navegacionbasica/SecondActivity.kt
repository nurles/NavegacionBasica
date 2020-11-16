package com.programacionmultimedia.navegacionbasica

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    companion object {
        const val IMG = "imagen"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val imagen = findViewById<ImageView>(R.id.pokeball)

        val src = intent.getStringExtra(IMG)

        src?.let {
            imagen.setImageResource(R.drawable.pikachu)
        }
    }
}