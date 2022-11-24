package com.example.lab6

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var togBtn: ToggleButton
    lateinit var anim: ObjectAnimator


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.image)
        togBtn = findViewById(R.id.toggleBtn)

        anim = ObjectAnimator.ofFloat(image, "rotation", 0f, 360f);
        anim.setDuration(1000);
        anim.setRepeatCount(1000);
        anim.setRepeatMode(ObjectAnimator.RESTART);
    }

    fun clickMe(view: View) {
        //1 - runOnUiThread Approach
        val thread = Thread(Runnable {
            runOnUiThread {
               
            }
        })

        thread.start()
    }
}