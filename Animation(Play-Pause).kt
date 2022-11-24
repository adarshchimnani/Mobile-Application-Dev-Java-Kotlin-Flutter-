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

     
    }

   
}