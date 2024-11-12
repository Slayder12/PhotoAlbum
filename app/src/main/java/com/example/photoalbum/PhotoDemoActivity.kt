package com.example.photoalbum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PhotoDemoActivity : AppCompatActivity() {

    private lateinit var imageIV: ImageView
    private lateinit var nextBTN: Button
    private var currentIndex = 0

    private val images = arrayOf(
        R.drawable._1,
        R.drawable._2,
        R.drawable._3,
        R.drawable._4,
        R.drawable._5,
        R.drawable._6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_demo)

        imageIV = findViewById(R.id.imageIV)
        nextBTN = findViewById(R.id.nextBTN)

        imageIV.setImageResource(images[currentIndex])

        nextBTN.setOnClickListener {
            currentIndex++
            if (currentIndex < images.size) {
                imageIV.setImageResource(images[currentIndex])
            } else {
                val intent = Intent(this, FinalActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }

}