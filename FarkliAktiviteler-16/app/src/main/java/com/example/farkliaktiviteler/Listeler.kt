package com.example.farkliaktiviteler

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Listeler : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listeler)

        recyclerView = findViewById(R.id.recyclerView)
        //Veri Hazırlığı

        var tarihKonulari = ArrayList<String>()
       tarihKonulari.add("İslamiyet Öncesi Türk Tarihi I")
       tarihKonulari.add("İlk Türk İslam Devletleri I")
       tarihKonulari.add("Türkiye Tarihi Beylikler Dönemi I")
       tarihKonulari.add("Osmanlı Kültür ve Medeniyet I")
       tarihKonulari.add("Osmanlı Kuruluş Dönemi I")
       tarihKonulari.add("Osmanlı Yükselme Dönemi I")
       tarihKonulari.add("Osmanl Duraklama Dönemi I")
       tarihKonulari.add("Osmanlı Gerileme Dönemi I")
       tarihKonulari.add("Osmanlı Dağılma Dönemi I")
       tarihKonulari.add("Trablusgarp ve Balkan Savaşları I")
       tarihKonulari.add("I.Dünya Savaşı I")
       tarihKonulari.add("Milli Mücadale Dönemi I")
       tarihKonulari.add("I.TBMM Dönemi I")
       tarihKonulari.add("Kurtuluş Savaşı Muhabereler Dönemi I")
       tarihKonulari.add("Atatürk Dönemi I")
       tarihKonulari.add("İnkılaplar I")
       tarihKonulari.add("Türkiye Cumhuriyet Dönemi I")
       tarihKonulari.add("Çağdaş Türk ve Dünya Tarihi I")

        // Verimsiz Tanımlamalar Bitmap

        /*

        val tarihBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.tarih) // görsel kullanmak Bitmap
        val cografyaBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.cografya) // görsel kullanmak Bitmap
        val vatandaslikBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.vatandaslik) // görsel kullanmak Bitmap
        val turkceBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.turkce) // görsel kullanmak Bitmap
        val matematikBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.matematik) // görsel kullanmak Bitmap
        //val tarihBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.tarih) // görsel kullanmak Bitmap
        //val cografyaBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.cografya) // görsel kullanmak Bitmap
        //val vatandaslikBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.vatandaslik) // görsel kullanmak Bitmap
        //val turkceBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.turkce) // görsel kullanmak Bitmap
        //val matematikBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.matematik) // görsel kullanmak Bitmap
        //val tarihBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.tarih) // görsel kullanmak Bitmap
        //val cografyaBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.cografya) // görsel kullanmak Bitmap
        //val vatandaslikBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.vatandaslik) // görsel kullanmak Bitmap
        //val turkceBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.turkce) // görsel kullanmak Bitmap
        //val matematikBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.matematik) // görsel kullanmak Bitmap
        //val tarihBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.tarih) // görsel kullanmak Bitmap
        //val cografyaBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.cografya) // görsel kullanmak Bitmap
        //val vatandaslikBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.vatandaslik) // görsel kullanmak Bitmap

        var konuResimleri = ArrayList<Bitmap>()
        konuResimleri.add(tarihBitmap)
        konuResimleri.add(cografyaBitmap)
        konuResimleri.add(vatandaslikBitmap)
        konuResimleri.add(matematikBitmap)
        konuResimleri.add(turkceBitmap)
        konuResimleri.add(tarihBitmap)
        konuResimleri.add(cografyaBitmap)
        konuResimleri.add(vatandaslikBitmap)
        konuResimleri.add(matematikBitmap)
        konuResimleri.add(turkceBitmap)
        konuResimleri.add(tarihBitmap)
        konuResimleri.add(cografyaBitmap)
        konuResimleri.add(vatandaslikBitmap)
        konuResimleri.add(matematikBitmap)
        konuResimleri.add(turkceBitmap)
        konuResimleri.add(tarihBitmap)
        konuResimleri.add(cografyaBitmap)
        konuResimleri.add(vatandaslikBitmap)


         */

        // Verimli tanımlamalar

        val tarihDrawbleId = R.drawable.tarih
        val cografyaDrawbleId = R.drawable.cografya
        val vatandaslikDrawbleId = R.drawable.vatandaslik
        val turkceDrawbleId = R.drawable.turkce
        val matematikDrawbleId = R.drawable.matematik


        var tarihKonulariDrawbleListesi = ArrayList<Int>()

        tarihKonulariDrawbleListesi.add(tarihDrawbleId)
        tarihKonulariDrawbleListesi.add(cografyaDrawbleId)
        tarihKonulariDrawbleListesi.add(vatandaslikDrawbleId)
        tarihKonulariDrawbleListesi.add(turkceDrawbleId)
        tarihKonulariDrawbleListesi.add(matematikDrawbleId)
        tarihKonulariDrawbleListesi.add(tarihDrawbleId)
        tarihKonulariDrawbleListesi.add(cografyaDrawbleId)
        tarihKonulariDrawbleListesi.add(vatandaslikDrawbleId)
        tarihKonulariDrawbleListesi.add(turkceDrawbleId)
        tarihKonulariDrawbleListesi.add(matematikDrawbleId)
        tarihKonulariDrawbleListesi.add(tarihDrawbleId)
        tarihKonulariDrawbleListesi.add(cografyaDrawbleId)
        tarihKonulariDrawbleListesi.add(vatandaslikDrawbleId)
        tarihKonulariDrawbleListesi.add(turkceDrawbleId)
        tarihKonulariDrawbleListesi.add(matematikDrawbleId)
        tarihKonulariDrawbleListesi.add(tarihDrawbleId)
        tarihKonulariDrawbleListesi.add(cografyaDrawbleId)
        tarihKonulariDrawbleListesi.add(vatandaslikDrawbleId)


        //Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        // val adapter = RecycleAdapter(tarihKonulari,konuResimleri)
        val adapter = RecycleAdapter(tarihKonulari,tarihKonulariDrawbleListesi)
        recyclerView.adapter = adapter






    }
    fun soruyagit(view: View){
        val intent = Intent(applicationContext,FragmentKotlin::class.java)
        startActivity(intent)
    }
}