package com.example.p_movil_viernes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnAccept: Button
    private lateinit var text_1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*btnAccept = findViewById(R.id.btnAccept)
        text_1 = findViewById(R.id.text_1)
        btnAccept.setOnClickListener {
            text_1.text = getString(R.string.button_clicked)
        }*/
    }
}