package com.example.farkliaktiviteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Sorular : AppCompatActivity() {

    lateinit var textView9: TextView
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular)

        //textverisi
        textView9 = findViewById(R.id.textView9)

        //img verisi
        imageView = findViewById(R.id.imageView)

        val intent = intent

        val secilenSoruNumarasi = intent.getStringExtra("soruNumarasi") // text yollanan veriyi al
        //textverisini yazdır
        textView9.text = secilenSoruNumarasi


        val secilenSoruGorseli = SingletonClass.SecilenSoru // intentle küçük verileri sadece yollayabiliriz. img yollanan veriyi al
        val secilenGorsel =secilenSoruGorseli.gorsel



        //textverisini yazdır
        textView9.text = secilenSoruNumarasi

        //imgverisini göster
        imageView.setImageBitmap(secilenGorsel)



    }
}