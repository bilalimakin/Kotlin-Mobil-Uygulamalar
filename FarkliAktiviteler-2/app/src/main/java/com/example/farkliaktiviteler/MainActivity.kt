package com.example.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var username: EditText // editText değişkenini tanımla Username
    private lateinit var password: EditText // editText değişkenini tanımla Pasword

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.username) // EditText'i layout dosyasındaki ID ile bağla Username
        password = findViewById(R.id.password) // EditText'i layout dosyasındaki ID ile bağla password
    }

    fun ileri(view: View){

        // Butona tıklayınca Veri alma
        val kullaniciAdi = username.text.toString()
        val kullaniciSifre = password.text.toString()

        val intent =Intent(applicationContext,IkinciActivity::class.java) // Intent oluştururken this kullan
        intent.putExtra("yollananVeri",kullaniciAdi+kullaniciSifre) // putExtra metodu düzeltilmiş hali
        startActivity(intent)
        finish()
    }
}