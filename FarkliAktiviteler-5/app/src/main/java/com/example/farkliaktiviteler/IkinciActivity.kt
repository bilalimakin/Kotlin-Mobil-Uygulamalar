package com.example.farkliaktiviteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView //textview kullanmak için import ettik
import android.content.Intent

class IkinciActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci)

        val intent = intent
        val alinanVeri = intent.getStringExtra("yollananVeri")

        val textView2 = findViewById<TextView>(R.id.textView2) // textView2'ye layout dosyasındaki ID ile bağla
        textView2.text = alinanVeri
    }

    fun osymKpssGit(view: View){
        val intent = Intent(applicationContext,GridileCalismak::class.java)
        startActivity(intent)

    }


}