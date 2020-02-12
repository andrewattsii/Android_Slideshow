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
        var index = 0

        //fetching the views to be sued in code , things to be clicked
        var imageSlide = findViewById<ImageView>(R.id.image_slide)
        var next_btn = findViewById<Button>(R.id.next_btn)
        var previous_btn = findViewById<Button>(R.id.previous_btn)

        //set onlcick listener
        next_btn.setOnClickListener {
            //when next button clicked will access image on app by default and call our images array and start at the first picture "[0]"
            //each time it is clicked the index will have 1 added causing the index number to chang
            if(index == images.size -1) {
                index = 0
            }
            index = index + 1
            imageSlide.setImageResource(images[index])
        }
        previous_btn.setOnClickListener {  }


    }
}
