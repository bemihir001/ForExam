package com.example.forexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.MotionEvent
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    //var orifont = 20F
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.btn01)
        val t1 = findViewById<TextView>(R.id.text01)


         b1.setOnClickListener{
             //orifont+=2F
             //t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, orifont)
             Intent(this, SecondActivity::class.java).also{
                 startActivity(it)
             }
             Toast.makeText(this, "Hello my friend!", Toast.LENGTH_LONG).show()
         }


        val img1 = findViewById<ImageView>(R.id.img01)
        val b2 = findViewById<Button>(R.id.btn02)

        b2.setOnClickListener{
            img1.animate().apply {
                duration = 1000
                scaleXBy(2f)
                scaleYBy(2F)
                //rotationXBy(360F)
                rotation(360F)


            }.withEndAction{
                img1.animate().apply {
                    duration = 1000
                    //rotationXBy(360F)
                    startDelay = 500
                    scaleXBy(-2f)
                    scaleYBy(-2F)

                }.start()
            }
        }

        val btn3 = findViewById<Button>(R.id.btn03)
        val img2 = findViewById<ImageView>(R.id.img02)

        btn3.setOnClickListener{

        }

    }
    


    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
    }
}