package com.programacionmultimedia.navegacionbasica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        val boton2 = findViewById<Button>(R.id.button2)
        val boton3 = findViewById<Button>(R.id.button3)

        boton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        boton2.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            val texto = "El editText de la activity anterior tenia una longitud de "+editText.text.length+" caracteres"
            intent.putExtra(ThirdActivity.PAL, texto )
            startActivity(intent)
        }

        boton3.setOnClickListener{
            val rand = random(0,20)
            if(rand%2 == 0) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra(SecondActivity.IMG, R.drawable.pikachu)
                startActivity(intent)
            }
            else {
                    val intent = Intent(this, ThirdActivity::class.java)
                    val texto2 = "El editText de la activity anterior contenia: "+editText.text.toString().toUpperCase(Locale.ROOT)
                    intent.putExtra(ThirdActivity.PAL, texto2)
                    startActivity(intent)
                }
        }
    }

    fun random(from: Int, to: Int) = (Math.random() * (to - from) + from).toInt()
}