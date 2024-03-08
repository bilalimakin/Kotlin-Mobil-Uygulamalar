package com.example.farkliaktiviteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SharedPreferencesKAYIT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences_kayit)
    }
    fun etutKayitYap(){
        finish()
    }
}