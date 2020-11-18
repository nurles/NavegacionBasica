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

        val id = intent.getIntExtra(IMG, 0)

        if(id != 0)
            imagen.setImageResource(id)

    }
}