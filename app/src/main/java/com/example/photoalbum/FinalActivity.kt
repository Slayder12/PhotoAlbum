package com.example.photoalbum

import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity


class FinalActivity : AppCompatActivity() {

    private lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        exitButton = findViewById(R.id.exitButton)

        exitButton.setOnClickListener {
            finishAffinity()
        }

    }



}