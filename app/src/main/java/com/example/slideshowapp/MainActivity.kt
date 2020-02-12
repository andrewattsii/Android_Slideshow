package com.example.slideshowapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //storing images in array
        var images = arrayOf(R.drawable.slide_1, R.drawable.slide_2, R.drawable.slide_3, R.drawable.slide_4 )


        //fetching the views to be sued in code , things to be clicked
        var imageSlide = findViewById<ImageView>(R.id.image_slide)
        var next_btn = findViewById<Button>(R.id.next_btn)
        var previous_btn = findViewById<Button>(R.id.previous_btn)

        //set onlcick listener
        next_btn.setOnClickListener {  }
        previous_btn.setOnClickListener {  }


    }
}
