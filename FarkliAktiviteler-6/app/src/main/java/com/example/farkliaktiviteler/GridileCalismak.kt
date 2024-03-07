package com.example.farkliaktiviteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class GridileCalismak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gridile_calismak)

        //Yaşam Döngüleri

        println("Oncreate Çağrıldı")
    }

    override fun onStart() {
        super.onStart()
        println("onStart Çağrıldı")
    }


    override fun onResume() {
        super.onResume()
        println("onResume Çağrıldı")
    }


    override fun onPause() {
        super.onPause()
        println("onPause Çağrıldı")
    }

    override fun onStop() {
        super.onStop()
        println("onStop Çağrıldı")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy Çağrıldı")
    }





    fun kpssTarihGit(view: View){
        val intent = Intent(applicationContext,Listeler::class.java)
        startActivity(intent)
    }
}