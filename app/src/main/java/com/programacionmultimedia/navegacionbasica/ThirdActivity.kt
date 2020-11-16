package com.programacionmultimedia.navegacionbasica

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    companion object {
        const val VAR = "tamano"
        const val PAL = "palabra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)
        val textView = findViewById<TextView>(R.id.textView)
        val texto = intent.getStringExtra(VAR)
        val texto2 = intent.getStringExtra(PAL)

        texto?.let {
            textView.text = texto
        }
        texto2?.let {
            textView.text = texto2
        }
    }
}

