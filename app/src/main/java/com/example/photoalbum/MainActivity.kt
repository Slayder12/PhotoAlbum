package com.example.photoalbum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    private lateinit var startButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        startButton = findViewById(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, PhotoDemoActivity::class.java)
            startActivity(intent)
        }

    }

}