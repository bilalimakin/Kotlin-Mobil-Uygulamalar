package com.example.kronometre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var isButtonClicked = false
    var isButtonClicked2 = false
    var isButtonClicked3 = false

    var numara = 0
    lateinit var textView: TextView
    var handler = Handler(Looper.getMainLooper())
    lateinit var runnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }

    fun artir(view: View) {
        numara += 1
        textView.text = "${numara}"
    }

    fun azalt(view: View) {
        numara -= 1
        textView.text = "${numara}"
    }

    fun baslat(view: View) {
        if (!isButtonClicked) {
            // İlk kez tıklandığında bu blok çalışacak
            isButtonClicked = true
            isButtonClicked3 = false


            numara = 0
            runnable = object : Runnable {
                override fun run() {
                    numara += 1
                    textView.text = "${numara}"
                    handler.postDelayed(this, 100)
                }
            }
            handler.post(runnable)

        }
    }

    fun dur(view: View){
        handler.removeCallbacks(runnable)
        isButtonClicked2 = false
    }

    fun devam(view: View){
        if (!isButtonClicked2) {
            // İlk kez tıklandığında bu blok çalışacak
            isButtonClicked2 = true
            isButtonClicked = true
            isButtonClicked3 = false


            runnable = object : Runnable {
                override fun run() {
                    numara += 1
                    textView.text = "${numara}"
                    handler.postDelayed(this, 100)
                }
            }
            handler.post(runnable)

        }
    }

    fun durdur(view: View) {
        if (!isButtonClicked3) {
            // İlk kez tıklandığında bu blok çalışacak
            isButtonClicked3 = true
            isButtonClicked2 = true


            handler.removeCallbacks(runnable)
            numara = 0
            textView.text = "0"
            isButtonClicked = false

        }
    }

    fun sifirla(view: View){
        recreate()
    }

}
