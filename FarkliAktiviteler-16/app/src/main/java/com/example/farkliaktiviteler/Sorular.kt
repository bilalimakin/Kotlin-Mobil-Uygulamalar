package com.example.farkliaktiviteler

import android.graphics.BitmapFactory
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

        //textverisini yazdır
        val secilenSoruNumarasi = intent.getStringExtra("soruNumarasi") // text yollanan veriyi al
        textView9.text = secilenSoruNumarasi


        //imgverisini göster
        /*
        val secilenSoruGorseli = SingletonClass.SecilenSoru // intentle küçük verileri sadece yollayabiliriz. img yollanan veriyi al
        val secilenGorsel =secilenSoruGorseli.gorsel
        imageView.setImageBitmap(secilenGorsel)
         */
        val secilenSoruGorseli = intent.getIntExtra("konuResimleriDrawble",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenSoruGorseli)
        imageView.setImageBitmap(bitmap)



    }
}