package com.programacionmultimedia.navegacionbasica

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    companion object {
        const val PAL = "palabra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        val textView = findViewById<TextView>(R.id.textView)

        textView.text  = intent.getStringExtra(PAL)

    }
}

