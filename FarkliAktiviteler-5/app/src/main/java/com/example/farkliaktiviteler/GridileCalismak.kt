package com.example.farkliaktiviteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class GridileCalismak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gridile_calismak)
    }
    fun kpssTarihGit(view: View){
        val intent = Intent(applicationContext,Listeler::class.java)
        startActivity(intent)
    }
}