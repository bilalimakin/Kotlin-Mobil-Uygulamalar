package com.example.sayac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var textView: TextView
        textView = findViewById(R.id.textView) // TextView'i tanımla

        object : CountDownTimer(25000, 1000) {
            override fun onFinish() {
                textView.text = "Kalan : 0"
            }

            override fun onTick(p0: Long) {
                textView.text = "Kalan: ${p0 / 1000}"
            }
        }.start()
    }
}
